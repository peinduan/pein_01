<%--
  Created by IntelliJ IDEA.
  User: DarryRing
  Date: 2019/7/4
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>accounts</title>
    <script src="/js/jquery.min.js"></script>
    <script>
        <%--$(function () {--%>
            <%--$("#btn").click(function () {--%>
                <%--$.post("account/findAll",function (data) {--%>
                    <%--<c:forEach items="${list}" var="accout">--%>
                        <%--${accout.id}--%>
                        <%--${accout.name}--%>
                        <%--${accout.money}--%>
                    <%--</c:forEach>--%>

                <%--},"json");--%>
            <%--});--%>
        <%--});--%>
    </script>
</head>
<body>
        <%--<input type="button" value="查询所有" id="btn">--%>
    <table border="1" cellspacing="0" cellpadding="0" width="30%" >
        <c:forEach items="${list}" var="accout">
            <tr>
                <td>${accout.id}</td>
                <td>${accout.name}</td>
                <td>${accout.money}</td>
            </tr>
        </c:forEach>
        </table>

</body>
</html>
