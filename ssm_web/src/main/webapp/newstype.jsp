<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/18 0018
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="appcomm/basePath.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>查询全部分类</h3>


<c:forEach var="nt" items="${newstypeList}">


    ${nt.ntypename}${nt.ntid}<br>


</c:forEach>


</body>
</html>
