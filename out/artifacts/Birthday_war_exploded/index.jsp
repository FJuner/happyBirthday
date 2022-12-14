<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title></title>
  <%--静态包含base标签、css样式、jQuery文件--%>
  <%@ include file="/pages/common/head.jsp" %>
  <link type="text/css" rel="stylesheet" href="static/css/style.css">
</head>
<body>
<div id="login_header">
  <span class="wel_word"></span>
</div>
<div class="login_banner">
  <div id="l_content">
    <span class="login_word">欢迎登录</span>
  </div>
  <div id="content">
    <div class="login_form">
      <div class="login_box">
        <div class="msg_cont">
          <b></b>
          <span class="errorMsg">
            ${empty requestScope.msg ? "请输入用户名和密码":requestScope.msg}
          </span>
        </div>
        <div class="form">
          <form action="loginServlet" method="post">
            <%--	添加隐藏域(用于合并servlet程序)								--%>
            <input type="hidden" name="action" value="login"/>
            <label>用户名称：</label>
            <input class="itxt" type="text" placeholder="请输入用户名"
                   autocomplete="off" tabindex="1" name="username"
                   value="${requestScope.username}"/>
            <br/>
            <br/>
            <label>用户密码：</label>
            <input class="itxt" type="password" placeholder="请输入密码"
                   autocomplete="off" tabindex="1" name="password"/>
            <br/>
            <br/>
            <input type="submit" value="登录" id="sub_btn"/>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>
</body>
</html>