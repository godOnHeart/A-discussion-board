# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.17/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.17/maven-plugin/reference/html/#build-image)
* [MyBatis Framework](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.17/reference/htmlsingle/index.html#web)

### Guides

The following guides illustrate how to use some features concretely:

* [MyBatis Quick Start](https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)


数据库设计
Users 表：用于存储用户信息。
user_id (主键，自增)
username
email
password_hash
registration_date
password_hash 存储经过哈希处理的用户密码，registration_date 存储用户注册日期。


Messages 表：用于存储留言信息。
message_id (主键，自增)
user_id (外键，关联到 Users 表中的 user_id)
message_text
creation_date
message_text 存储留言的内容，creation_date 存储留言创建日期。


Comments 表：用于存储留言的评论信息。
comment_id (主键，自增)
user_id (外键，关联到 Users 表中的 user_id)
message_id (外键，关联到 Messages 表中的 message_id)
comment_text
creation_date
comment_text 存储评论的内容，creation_date 存储评论创建日期。


Likes 表：用于存储用户对留言和评论的点赞信息。
like_id (主键，自增)
user_id (外键，关联到 Users 表中的 user_id)
message_id (外键，关联到 Messages 表中的 message_id)
comment_id (外键，关联到 Comments 表中的 comment_id)
此表可以用于跟踪用户对留言和评论的点赞操作。


Tags 表：用于存储留言主题标签信息（可选）。
tag_id (主键，自增)
tag_name

