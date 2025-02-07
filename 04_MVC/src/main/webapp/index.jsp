<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
    <h2>Hello World</h2>

    <form action="${contextPath}/login" method="post">
        <label for="userId">id : </label>
        <input type="text" id="userId" name="userId"/>
        <br>
        <label for="userPwd">password : </label>
        <input type="password" id="userPwd" name="userPwd"/>
        <br>
        <input type="button" value="join"/>
        <input type="submit" value="login"/>
    </form>

</body>
</html>