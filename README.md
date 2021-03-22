# my-demo-microservice-spring-cloud

1.All operation can be done from api-gateway i.e. no need to hit user-service on 7002 or depratment-service on 7001 

2.Hystrix for fallback mechanism - not working

3.lb - Load Balanced 

4.** - wildcard

5.spring.cloud.gateway.discovery.locator.enabled=true
  spring.cloud.gateway.discovery.locator.lower-case-service-id=true


6.http://localhost:7000/actuator/hystrix.stream      - api-gateway
7.http://localhost:7005/hystrix                      - hystrix-dashboard


8.start service-regitry -> cloud-config -> api-gateway -> department-service -> user-service -> hystrix-dashboard

9.Central config file : https://github.com/Taufik-Hub/my-demo-microservice-cloud-config

10.H2 database is used

11.Versions: 
	Spring <version>2.3.9.RELEASE</version>
	<java.version>1.8</java.version>
	<spring-cloud-services.version>2.3.0.RELEASE</spring-cloud-services.version>
	<spring-cloud.version>Hoxton.SR10</spring-cloud.version>

12.start zipkin-server on local

13.covered point
	centralize-config
	service-registry
	api-gateway
	distributed-tracing
	fault-taularance
	load-balance
	microservice-communication
