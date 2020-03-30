# jfinal项目

- jfinal项目是有自带的main函数的</br>
maven(父子工程)+idea&emsp;[jfinal配置](http://www.jfinal.com/share/36?p=1#reply_start)
- 父工程的pom.xml中关于jfinal依赖修改为

```java
  <dependency>
    <groupId>com.jfinal</groupId>
    <artifactId>jfinal</artifactId>
    <version>${jfinal.version}</version>
    <scope>compile</scope>
 </dependency>
 ```
