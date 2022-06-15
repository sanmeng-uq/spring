<%--
  Created by IntelliJ IDEA.
  User: TFPC
  Date: 2022/6/15
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax发送json</title>
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/js/jquery-3.6.0.js"></script>
    <script type="text/javascript">
        $(function () {
            // 定义JSON字符串
            let user_jsonStr = {"id": "1001", "name": "C语言程序设计", "publisher": "清华出版社", "publishDate": new Date()};
            // 转为JSON对象
            let jsonObj = JSON.stringify(user_jsonStr);

            $("#btn").click(function () {
                $.ajax({
                    "url": "${pageContext.request.contextPath}/addBook",
                    "type": "post",      // 请求的方式
                    "data": jsonObj,     // 发送的数据，上面已经定义
                    "dataType": "json",  // 响应回来的数据格式
                    "contentType": "application/json;charset=UTF-8", // 表示发送给服务器的数据类型，这里设置为json格式
                    "success": function (resp) {
                        console.log(resp);
                    }
                });
            });
        });
    </script>
</head>
<body>
<button id="btn">发送JSON数据</button>
</body>

</html>
