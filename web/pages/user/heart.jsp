
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="shortcut icon" href="#">
    <%--静态包含base标签、css样式、jQuery文件--%>
    <%@ include file="/pages/common/head.jsp" %>
    <link type="text/css" rel="stylesheet" href="static/css/heart.css">
</head>

<body>
<audio src="static/media/Dan + Shay、Justin Bieber - 10,000 Hours.mp3" controls autoplay></audio>
<div class="love3d">
    <div class="cube">
        <div class="in_frond"><img src="static/img/1.jpg" alt=""></div>
        <div class="in_back"><img src="static/img/2.jpg" alt=""></div>
        <div class="in_left"><img src="static/img/2.jpg" alt=""></div>
        <div class="in_right"><img src="static/img/1.jpg" alt=""></div>
        <div class="in_top"><img src="static/img/1.jpg" alt=""></div>
        <div class="in_bottom"><img src="static/img/2.jpg" alt=""></div>
    </div>
</div>
<script type="text/javascript">
    //类数组长度为1
    var love3d = document.getElementsByClassName("love3d")[0];
    for (var i = 0; i < 36; i++) {
        // 创建一个元素
        var tDiv = document.createElement("div");
        tDiv.className = "heart";
        tDiv.style.transform = "rotateY(" + i * 10 + "deg) rotateZ(45deg) translateX(100px)";
        //依次添加
        love3d.appendChild(tDiv);
    }
</script>
</body>
</html>
