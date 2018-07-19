# microservice-eureka-ribbon-feign-hystrix
微服务（服务发现组件Eureka-负载均衡Ribbon-REST调用Feign-实现容错Hystrix）

简介：

microservice-eureka-ribbon-feign-hystrix-demo

服务提供者：microservice-simple-provider-user（用户个人信息）

服务提供者：microservice-simple-provider-user-ha（用户个人信息-副本）

服务消费者：microservice-simple-consumer-movie （购电影票，负载均衡调用个人信息REST，发现容错）

服务发现组件：microservice-discovery-eureka （服务发现组件 Eureka Server）

simple文件：简单测试，没有添加日志

依据：该demo是学习《Spring Cloud与Docker微服务架构实战》测试，建议阅读这本书，我这里就不重复介绍代码了

版本：jdk-1.8；springboot-2.0.3；springcloud-Finchley.RELEASE

注意：springcloud版本不同，Eureka、Ribbon和Feign的jar名称也不同
