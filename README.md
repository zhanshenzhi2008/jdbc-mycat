# jdbc-mycat
mycat分库分表中间件


application.properties Mycat配置如下

```
# 配置数据源
spring.datasource.druid.driver-class-name=com.mysql.jdbc.Driver
# Mycat里的server.xml里的账号密码，不是数据库的密码。
spring.datasource.druid.username=root
spring.datasource.druid.password=123456
# Mycat的逻辑库 端口也是Mycat的 TESTDB是schema.xml配置
spring.datasource.druid.url=jdbc:mysql://192.168.135.128:8066/TESTDB
```


## MySQL 配置注意
com.mysql.jdbc.Driver 是 mysql-connector-java 5中的，
com.mysql.cj.jdbc.Driver 是 mysql-connector-java 6中的
1.JDBC连接Mysql5 com.mysql.jdbc.Driver:
```
driverClassName=com.mysql.jdbc.Driver
url=jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=false
```
2.JDBC连接Mysql6 com.mysql.cj.jdbc.Driver 需要指定时区serverTimezone:
在设定时区的时候，如果设定serverTimezone=UTC，会比中国时间早8个小时，如果在中国，可以选择Asia/Shanghai或者Asia/Hongkong，例如：
```
driverClassName=com.mysql.cj.jdbc.Driver
url=jdbc:mysql://localhost:3306/test?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=falsex
```
