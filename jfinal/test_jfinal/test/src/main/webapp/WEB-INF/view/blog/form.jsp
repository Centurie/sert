<%--
  Created by IntelliJ IDEA.
  User: 450538710
  Date: 2020/2/25
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>臭弟弟</title>
</head>
<body>
<!-- 用于为用户输入创建 HTML 表单 -->
<form action="/blog/form" method="post">
<input type="text" name="blog.title"><br>
    <!--多行的文本输入控件-->
<textarea style="width: 600px;height: 200px"></textarea><br>
    <!-- submit() 方法把表单数据提交到Web服务器。-->
    <input type="submit" value="确认提交">
</form>
</body>
</html>
