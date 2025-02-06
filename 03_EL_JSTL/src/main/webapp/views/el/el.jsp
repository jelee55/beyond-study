<%@ page import="com.beyond.eljstl.Student" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
    <%
        // Request 영역에 저장된 속서을 가져온다
        // Integer classRoom = (Integer)request.getAttribute("classRoom");
        // Student student = (Student)request.getAttribute("student");

        // Session 영역에 저장된 속서을 가져온다
        // int classRoom = (Integer)session.getAttribute("classRoom");
        // Student student = (Student)session.getAttribute("student");
    %>
<html>
<head>
    <title>EL(Expression Language)</title>
</head>
<body>
    <h2>EL(Expression Language)</h2>

    <h3>1. 기존 방식으로 request, session 객체에 담겨있는 데이터를 출력</h3>
    <%--
        강의장 : 강의실 <%=classRoom%><br>
        수강생 : <%=student.getName()%>, <%=student.getAge()%><br>
    --%>

    <h3>2. EL 방식으로 request, session 객체에 담겨있는 데이터를 출력</h3>
    <%--
        1. EL은 영역 객체에 지정된 속성명을 검색해서 존재하는 경우 값을 가져옴
            - Page 영억 -> Request 영역 ->  Session 영역 -> Application 영역 순으로 해당 속성을 찾아서 값을 전달
        2. EL은 객체의 필드에 직접 접근하는 것처럼 보이지만
            내부적으로 해당 객체의 Getter 메소드로 접근해서 값을 읽어옴
    --%>

        강의장 : 강의실 ${classRoom}<br>
        수강생 : ${student.name}, ${student.age}

        강의장 : 강의실 ${sessionScope.classRoom}<br>
        수강생 : ${sessionScope.student.name}, ${sessionScope.student.age}

    <h3>3. EL 사용 시 영역 객체에 저장된 속성명이 같은 경우</h3>
    <%
        pageContext.setAttribute("scope", "Page 영역");
    %>
    scope: ${scope}<br>
    pagescpoe : ${pageScope.scope}<br>
    requestScope : ${requestScope.scope}<br>
    sessionScope : ${sessionScope.scope}<br>
    applicationScope : ${applicationScope.scope}<br>




</body>
</html>
