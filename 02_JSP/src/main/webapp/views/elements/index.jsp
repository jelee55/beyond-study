<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2025-02-04
  Time: 오전 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>JSP 스크립트 요소</title>
</head>
<body>

    <select>
        <option value="ktx">KTX</option>
        <option value="itx">ITX 새마을</option>
        <option value="mugung">무궁화호</option>

    </select>
    <input type="file" value="파일">

    <h2>JSP 스크립트 요소</h2>
    <!-- HTML 주석 태그 -->
    <%-- JSP 주석 태그 --%>
    <%--
        두 주석의 차이점
        페이지의 소스 보기 혹은 개발자 도구에서 HTML 주석은 확인 가능하고 JSP 주석은 확인이 불가능함
     --%>

    <%-- 선언문 태그 --%>
    <%!
        // 필드 선언
        private String name = "홍길동";

        // 메소드 선언
        private String getName(){
            return this.name;
        }
    %>

    <%-- 스크립트릿 태그 --%>
    <%
        // 자바 코드 기술
        int sum = 0;
        for (int i = 0; i <=10; i++){
            sum += i;
    %>
        <h3>안녕하세요.</h3>
    <%
        }
        // out.print("sum : " + sum );
        System.out.println(sum);
    %>

    <%-- 스크립트릿 태그 --%>
    저의 이름은 <% out.print(name);%>입니다</br>
    저의 이름은 <%=name%>입니다<br><br>

    1부터 10까지의 합은 <span style="font-size: 2rem; color: aqua"><%=sum%></span>입니다.


</body>
</html>
