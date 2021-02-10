Eureka is used for service registration and discovery.
Services can discovery each other using unique url.
IP of services can change and it will not affect clients as client will be using unique url.
Every client registers itself with eureka server.
You can run multiple instances of eureka to avoid a single point of failure.


Steps-
------
1. Create new project eureka-server.
2. Add spring-cloud-starter-netflix-eureka-server dependency
3. Add @EnableEurekaServer in main class
4. Add below properties in eureka-server.yml
		#Configure the eureka discovery server
		eureka:
		  instance:
		    hostname: localhost
		  client: # Not a client, don't register with yourself
		    registerWithEureka: false
		    fetchRegistry: false
		    serviceUrl:
		      defaultZone: http://localhost:8761/eureka
		server:
		  port: 8761
  
5. In bootstrap.properties, specify config-server project uri
		spring.application.name=eureka-server
		spring.cloud.config.uri=${CONFIG_SERVER_URL:http://localhost:3333}
		 
		 
6. Eureka cluster
		//TODO		 
