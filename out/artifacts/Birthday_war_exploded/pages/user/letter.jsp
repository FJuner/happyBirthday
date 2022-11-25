<%--
  Created by IntelliJ IDEA.
  User: 17606
  Date: 2022/11/20
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--静态包含base标签、css样式、jQuery文件--%>
    <%@ include file="/pages/common/head.jsp" %>
    <link type="text/css" rel="stylesheet" href="static/css/letter.css">
</head>
<body>
<audio src="static/media/杨奕泽 - Happy Birthday (片段).mp3" autoplay controls loop></audio>
<div class="index">

    <table class="first">
        <caption>
            人生岁月不哀戚 还有梦境与黎明
        </caption>
    </table>
    <table class="second">
        <caption>
            要永远年轻 永远热情
        </caption>
    </table>
    <table class="third">
        <caption>
            生活明朗 万物可爱
        </caption>
    </table>
    <table class="fourth">
        <caption>
            人间值得 未来可期
        </caption>
    </table>
    <table class="fifth">
        <caption>
            愿你欣逢许多夏日的清晨
        </caption>
    </table>
    <table class="sixth">
        <caption>
            愉快地 欢喜地航抵你前所未见的港湾
        </caption>
    </table>
    <table class="seventh">
        <caption>
            幸运的爱 与勇者长相随
        </caption>
    </table>
    <table class="eighth">
        <caption>
            愿你一生欢喜 不为世俗所忧
        </caption>
    </table>
    <table class="before">
        <caption>
            小张 生日快乐 ！
        </caption>
    </table>
    <table class="later">
        <caption>
            小张 生日快乐 ！
        </caption>
    </table>
    <table class="left">
        <caption>
            小张 生日快乐 ！
        </caption>
    </table>
    <table class="right">
        <caption>
            小张 生日快乐 ！
        </caption>
    </table>
</div>
<div class="button">
    <form action="nextServlet" method="post">
<%--        <div class="next">--%>
<%--            <input type="password" placeholder="请输入密码后"--%>
<%--                   autocomplete="off" tabindex="1" name="password"--%>
<%--            &lt;%&ndash;               密码为 1102&ndash;%&gt;--%>
<%--            />--%>
<%--        </div>--%>
        <div class="sub_btn">
            <input type="submit" value="点击查看"/>
        </div>
    </form>
</div>
</body>
</html>
