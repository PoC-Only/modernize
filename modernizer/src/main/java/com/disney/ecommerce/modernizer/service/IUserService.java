package com.disney.ecommerce.modernizer.service;

import com.disney.ecommerce.modernizer.domain.Login;
import com.disney.ecommerce.modernizer.domain.Response;

/**
* IUserService interface
*
* @author  Renino Niefes
* @version 1.0
* @since   2018-05-11 
*/
public interface IUserService {
	public Response login(Login userlogin);
}
