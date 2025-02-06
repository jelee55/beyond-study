
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%
  String year = "2024";
%>
<html>
<head>
    <title>include 페이지</title>
</head>
<body>
    <h5>include 페이지</h5>
    <p>
      include.jsp 페이지의 year 편수의 값은 <%=year%>
    </p>

    userName: ${param.userName}

    <br>
    <br>



</body>
</html>
