# jdbc-mycat
mycat分库分表中间件


application.properties Mycat配置如下

# 配置数据源
spring.datasource.druid.driver-class-name=com.mysql.jdbc.Driver
# Mycat里的server.xml里的账号密码，不是数据库的密码。
spring.datasource.druid.username=root
spring.datasource.druid.password=123456
# Mycat的逻辑库 端口也是Mycat的 TESTDB是schema.xml配置
spring.datasource.druid.url=jdbc:mysql://192.168.135.128:8066/TESTDB
