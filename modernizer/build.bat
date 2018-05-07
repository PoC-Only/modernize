@echo off
break off

echo compiling...
call mvn clean package

echo removing old docker container...
docker rm -f modernizer_container

echo running docker container...
docker run --name modernizer_container -d -e "SPRING_PROFILE_ACTIVE=dev" -p 443:443 springio/modernizer:4.0.3.1-SNAPSHOT