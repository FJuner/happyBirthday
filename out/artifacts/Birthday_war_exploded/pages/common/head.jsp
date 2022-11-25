<%--
  Created by IntelliJ IDEA.
  User: 17606
  Date: 2022/9/17
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--设置动态访问地址--%>
<%
    String basePath = request.getScheme()
        + "://"
        + request.getServerName()
        + ":"
            + request.getServerPort()
            + request.getContextPath()
            + "/";
   pageContext.setAttribute("basePath",basePath);

%>

<!--		使用base标签，永远固定相对路径跳转的结果-->
<%--<base href="http://localhost:8080/book2/">--%>

<base href="<%=basePath%>">


<!--	使用	<base href="http://localhost:8080/book/">之后
路径默认跳转到book/web,
所以css和script的路径("../../static/css/style.css")要改：去掉../../即可
-->

<%--<link type="text/css" rel="stylesheet" href="static/css/style.css">--%>
<link type="text/css" rel="stylesheet" href="static/css/reset.css">
<script type="text/javascript" src="static/script/jquery-1.7.2.js"></script>
