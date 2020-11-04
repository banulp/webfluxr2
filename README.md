# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Data R2DBC](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/reference/html/spring-boot-features.html#boot-features-r2dbc)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Acessing data with R2DBC](https://spring.io/guides/gs/accessing-data-r2dbc/)

### Additional Links
These additional references should also help you:

* [R2DBC Homepage](https://r2dbc.io)

* http://localhost:8080/banulp.lv/getBooks

### create db
CREATE DATABASE IF NOT EXISTS `bookshelter`;

### create table
USE `bookshelter`;

CREATE TABLE IF NOT EXISTS `changbi` (

  `id` bigint NOT NULL AUTO_INCREMENT,
  
  `title` varchar(50) DEFAULT NULL,
  
  `author` varchar(50) DEFAULT NULL,
  
  `star` int DEFAULT NULL,
  
  PRIMARY KEY (`id`)
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



