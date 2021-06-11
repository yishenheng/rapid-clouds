# rapid-clouds

基于SpringCloud搭建的一个学习的框架整合的脚手架

# 背景

学习框架的整合，在公司都是架构师搭建好了，自己尝试搭建的时候总会出现jar冲突、版本不符合等。此项目用来自己学习搭建使用。

# SpringCloud和SpringBoot版本选择：

https://spring.io/projects/spring-cloud

![Image](https://github.com/yishenheng/rapid-clouds/blob/main/images/sbsc-version.jpg)

# 技术选型

| 技术               | 版本          | 说明                                                 | 官网地址                                                     |
| ------------------ | ------------- | ---------------------------------------------------- | ------------------------------------------------------------ |
| SpringBoot         | 2.3.0.RELEASE | 容器+MVC框架                                         | https://spring.io/projects/spring-boot                       |
| SpringCloud        | Hoxton.SR9    | 微服务框架                                           | [ https://spring.io/projects/spring-cloud](https://spring.io/projects/spring-cloud) |
| Consul             | Hoxton.SR9    | CP类型的服务注册中心                                 | https://spring.io/projects/spring-cloud-consul               |
| OpenFeign+Ribbon   | Hoxton.SR9    | 服务之间的负载均衡通讯                               | https://spring.io/projects/spring-cloud-openfeign            |
| Hystrix             | Hoxton.SR9    | 服务提供容错机制，保护服务的安全                     | https://github.com/Netflix/Hystrix                           |
| Gateway            | Hoxton.SR9    | 提供统一入口，负责路由转发、断言、过滤器等           | https://spring.io/projects/spring-cloud-gateway              |
| Hutool             | 5.4.0         | 统一工具类                                           | https://hutool.cn/docs/#/                                    |
| SpringCloudAlibaba | 2.1.0.RELEASE | 国产的微服务框架                                     | https://spring.io/projects/spring-cloud-alibaba              |
| Nacos              | 2.1.0.RELEASE | 支持CP、AP切换的注册中心，同时自带配置中心和Ribbon。 | https://nacos.io/zh-cn/docs/quick-start.html                 |
|                    |               |                                                      |                                                              |
|                    |               |                                                      |                                                              |
| Knife4j            | 2.0.2         | “漂亮的”swagger-ui界面                               | https://doc.xiaominfo.com/                                   |
| Mybatis            |               |                                                      |                                                              |
| Mybatis-Plus       | 3.4.0         | Mybatis增强器，简化CURD                              | https://mp.baomidou.com                                      |
| Druid              | 1.1.23        | 阿里的JDBC 连接池、监控组件                          |                                                              |
|                    |               |                                                      |                                                              |
|                    |               |                                                      |                                                              |
|                    |               |                                                      |                                                              |
|                    |               |                                                      |                                                              |

# 环境配置

| 工具  | 版本号 | 官方地址                                                     |
| ----- | ------ | ------------------------------------------------------------ |
| JDK   | 1.8    | https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html |
| Maven | 3.3.9  | https://maven.apache.org/                                    |
| Mysql | 8      | https://www.mysql.com/                                       |




# 爬坑记录：
全局异常没有生效：
```markdown
使用@ControllerAdvice作为全局异常处理的时候，因为我的@ControllerAdvice放在了common包中，业务代码在其他的包中。

所以导致没有被Spring容器注入进去。只需要在业务代码中的SpringBootAppliance手动扫描@ControllerAdvice的包即可
``` 
OpenFeign整合Hystrix时报错Ambiguous mapping
```markdown
使用OpenFeign的时候在类上添加@RequestMapping是没问题的，整合后hystrix后会报错Ambiguous mapping

删除类上的@RequestMapping，放到方法上即可
```