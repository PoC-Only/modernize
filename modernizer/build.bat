@echo off
break off

echo compiling...
call mvn clean package -DskipTests

echo removing old docker container...
echo docker rm -f modernizer_container

echo running docker container...
echo docker run --name modernizer_container -d -e "SPRING_PROFILE_ACTIVE=dev" -p 443:443 springio/modernizer:4.0.3.1-SNAPSHOT

call java -jar target\modernizer-4.0.3.1-SNAPSHOT.jar