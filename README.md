In this article we are going to protect a spring boot rest api in a simple way using `Spring security` with basic authentication . This is [part I](https://github.com/maronesamir/spring-boot-security) of a series of articles on spring security topic

Curl command:
```
curl http://localhost:8080/
curl http://localhost:8080/ping
curl http://localhost:8080/protected
curl http://localhost:8080/protected -u user:secret
curl http://localhost:8080/admin -u user:secret
curl http://localhost:8080/admin -u admin:supersecret
```

More articles can be found here: https://wstutorial.com