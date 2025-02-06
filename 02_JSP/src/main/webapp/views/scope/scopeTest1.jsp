<%@ page import="jdk.jshell.spi.ExecutionControl" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>영역 객체</title>
</head>
<body>
    <h2>영역 객체</h2>

    Session 영역에 저장된 데이터 : <%=session.getAttribute("address")%><br>
    application 영역에 저장된 데이터 : <%=application.getAttribute("name")%><br>



</body>
</html>
