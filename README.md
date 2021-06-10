# rapid-clouds

基于SpringCloud搭建的一个学习的框架整合的脚手架

# 背景

学习框架的整合，在公司都是架构师搭建好了，自己尝试搭建的时候总会出现jar冲突、版本不符合等。此项目用来自己学习搭建使用。

# SpringCloud和SpringBoot版本选择：

https://spring.io/projects/spring-cloud

![Image](https://github.com/yishenheng/rapid-clouds/blob/main/images/sbsc-version.jpg)

# 技术选型

| 技术             | 版本          | 说明                                       | 官网地址                                                     |
| ---------------- | ------------- | ------------------------------------------ | ------------------------------------------------------------ |
| SpringBoot       | 2.3.0.RELEASE | 容器+MVC框架                               | https://spring.io/projects/spring-boot                       |
| SpringCloud      | Hoxton.SR9    | 微服务框架                                 | [ https://spring.io/projects/spring-cloud](https://spring.io/projects/spring-cloud) |
| Consul           | Hoxton.SR9    | CP类型的服务注册中心                       | https://spring.io/projects/spring-cloud-consul               |
| OpenFeign+Ribbon | Hoxton.SR9    | 服务之间的负载均衡通讯                     | https://spring.io/projects/spring-cloud-openfeign            |
| Hystix           | Hoxton.SR9    | 服务提供容错机制，保护服务的安全           | https://github.com/Netflix/Hystrix                           |
| Gateway          | Hoxton.SR9    | 提供统一入口，负责路由转发、断言、过滤器等 | https://spring.io/projects/spring-cloud-gateway              |
| Hutool           | 5.4.0         | 统一工具类                                 | https://hutool.cn/docs/#/                                    |
| 待补充。。。     |               |                                            |                                                              |
|                  |               |                                            |                                                              |

# 环境配置

| 工具       | 版本号 | 官方地址                                                     |
| ---------- | ------ | ------------------------------------------------------------ |
| JDK        | 1.8    | https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html |
| Maven      | 3.3.9  | https://maven.apache.org/                                    |
| 待补充。。 |        |                                                              |

