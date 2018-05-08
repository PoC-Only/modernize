package com.disney.ecommerce.modernizer.security;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.disney.ecommerce.modernizer.domain.Token;

import java.security.Key;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import io.jsonwebtoken.*;
import java.util.Date;
import static com.disney.ecommerce.modernizer.security.SecurityConstants.SECRET;

/**
 * JWTUtil contains JWT related actions such as creation of tokens and
 * authentication.
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-04-17
 */
@Component("JWTUtil")
public class JWTUtil {
	public static final String ISO_8601_24H_FULL_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";

	@Autowired
	private Environment env;

	public Token createJWT(String accountId, String myDLPHash, String expiration) {
		DateFormat dateFormat = new SimpleDateFormat(JWTUtil.ISO_8601_24H_FULL_FORMAT);
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

		long nowMillis = System.currentTimeMillis();
		Date now = new Date(nowMillis);

		byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SECRET);
		Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

		JwtBuilder builder = Jwts.builder().setId(SecurityConstants.JWT_ID).setIssuedAt(now)
				.setSubject(SecurityConstants.JWT_SUBJECT).setIssuer(SecurityConstants.JWT_ISSUER)
				.claim("account_id", accountId).claim("myDLPHash", myDLPHash).claim("expiration", expiration)
				.signWith(signatureAlgorithm, signingKey);

		Token token = new Token();
		token.setToken(builder.compact());
		token.setAccountId(accountId);
		token.setMyDLPHash(myDLPHash);
		token.setExpiration(expiration);

		return token;
	}

	public Token parseJWT(String jwt) {
		Token token = null;
		try {
			Claims claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(SECRET)).parseClaimsJws(jwt)
					.getBody();

			token = new Token();
			token.setToken(jwt);
			token.setAccountId(claims.get("account_id").toString());
			token.setMyDLPHash(claims.get("myDLPHash").toString());
			token.setExpiration(claims.get("expiration").toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return token;
	}
}
