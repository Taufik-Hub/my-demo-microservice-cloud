All operation can be done from api gateway i.e. no need to user 7001 fro depratment and 7002 for user
user 7000 for both

also contail hystrix for fall back mechanism

#lb - Load Balanced ** - wildcard

spring.cloud.gateway.discovery.locator.enabled=true
spring.cloud.gateway.discovery.locator.lower-case-service-id=true


http://localhost:7000/actuator/hystrix.stream      - api-gateway
http://localhost:7005/hystrix    - hystrix-dashboard


start service-regitry-> cloud-config-> api-gateway-> department-service->user-service->hystrix-dashboard

https://github.com/Taufik-Hub/my-demo-microservice-cloud-config

H2 database is used

Spring <version>2.3.9.RELEASE</version>
<java.version>1.8</java.version>
<spring-cloud-services.version>2.3.0.RELEASE</spring-cloud-services.version>
<spring-cloud.version>Hoxton.SR10</spring-cloud.version>

start zipkin server

central-config
service-registry
api-gateway
distributed-tracing
fault-taularance
load-balance
microservice-communication
