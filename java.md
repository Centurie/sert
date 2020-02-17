## 一些基础知识
- 1. jar包和war包的区别：war是一个web模块，其中需要包括WEB-INF，是可以直接运行的WEB模块；jar一般只是包括一些class文件，在声明了Main_class之后是可以用java命令运行的。
 2. war是Sun提出的一种Web应用程序格式，也是许多文件的一个压缩包.JAR文件格式以流行的ZIP文件格式为基础。

- jar包是编译后的class包。带core是核心类比如_核心`slf4j-core.jar`而`slf4j-api.jar`则有其他扩展代码。
```
spring-core-4.1.2.RELEASE-javadoc.jar API
	 spring-core-4.1.2.RELEASE-sources.jar 源码
	 spring-core-4.1.2.RELEASE.jar 运行jar包
```
## IDEA操作
#### 添加web文件夹
- idea => file -> project Structure -> Modules -> 绿色加号 -> Web ->更改Web Resource Directory下面的默认路径，指定webapp路径 <label style="color:red">确定</label>
#### 添加依赖
- ***maven*** 打开 pom.xml 文件，快捷键 alt + Insert选择 dependency 输入要添加的jar包名或者检索
- 普通 web -> WEN-INF ->右键 -> New ->Directory ->取名lib 复制相应的jar包 [这只是结构上的] -> <label style="color:red">添加web文件夹步骤前3步或者右上方图标</label> ->libraries->绿色加号 ->java ->选择lib ->jar directory(可能是javaweb) ->ok
-***验证添加web文件夹操作前4步-选择dependencies可看到lib文件夹且有5条竖线标志***

## J2EE十三个规范
