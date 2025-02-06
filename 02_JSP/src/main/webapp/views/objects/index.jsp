<%@ page import="java.util.Enumeration" %>
<%@ page import="javax.xml.crypto.Data" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Arrays" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP 내장 객체</title>
</head>
<body>
    <h2>JSP 내장 객체</h2>
    <h3>1. request</h3>
    <p>
        웹 브라우저의 요청 정보를 가지고 있는 객체임
    </p>

        <h4>1) 헤더와 관련된 메소드</h4>
        <table border="1">
            <tr>
                <td>헤더 이름</td>
                <td>헤더 값</td>
            </tr>
            <%
                Enumeration<String> headerNames = request.getHeaderNames();
                while (headerNames.hasMoreElements()){
                    String headerName = headerNames.nextElement();
            %>
            <tr>
                <td> <%=headerName%></td>
                <td> <%=request.getHeader(headerName)%></td>
            </tr>
            <%
                }
            %>


        </table>
        <h4>2) URL / URI, 요청 바익과 관련된 메소드</h4>
        <table border="1">
            <tr>
                <td>이름</td>
                <td>값</td>
            </tr>
            <tr>
                <td>프로토콜</td>
                <td><%=request.getProtocol()%></td>
            </tr>
            <tr>
                <td>요청 방식</td>
                <td><%=request.getMethod()%></td>
            </tr>
            <tr>
                <td>URL</td>
                <td><%=request.getRequestURL()%></td>
            </tr>
            <tr>
                <td>URI</td>
                <td><%=request.getRequestURI()%></td>
            </tr>
            <tr>
                <td>Query String</td>
                <td><%=request.getQueryString()%></td>
            </tr>
            <tr>
                <td>웹 애플리케이션 경로</td>
                <td><%=request.getContextPath()%></td>
            </tr>
        </table>

    <h3>2. response</h3>
    <p>
        웹 브라우저
    </p>
        <h4>1) 응답 헤더와 관련되 메소드</h4>

        <%
            // response.setContentType("text/html;charset=UTF-8");
            // response.setHeader("Authorization", "nearer-abcdefg");
        %>

        <h4>2) 응답 상태와 관련된 메소드</h4>
        <%
            // response.setStatus(201);
            // response.sendError(500);
            // response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        %>

        <h4>3) 리다이렉트(Redirect)</h4>
        <p>
            지정된 URL로 클라이언트가 요청을 재전송함
        </p>

        <a href="redirect.jsp">View Details</a>

    <h3>3. pageContext</h3>

    <p>
        JSP와 관련된 다른 내장 객체를 얻어내거나
        현재 페이지의 요청과 응답의 제어권을 다른 페이지로 넘겨주는데 사용하는 객체
    </p>

        <h4>1) 포워드(Forward)</h4>
        <p>
            현재 페이지의 요청과 응답의 제어궈너을 다른 페이지로 넘겨줌
        </p>
        <a href="forward.jsp">View Details</a>

    <h3>4. session</h3>
    <p>
        웹 브라우저의 정보를 유지하기 위한 세션 정보를 저장하고 있는 객체<br><br>
    </p>

        <h4>1) session이란?</h4>

            세션이란 서버 측의 컨테이너에서 관리되는 정보를 의미함<br>
            세션은 클라이언트와 서버 간의 접속을 유지시켜주는 역할을 함<br>
            세션의 정보는 클라이언트에서 접속해서 브라우저를 종료할 떄까지 유지됨<br><br>

        <%
            session.setAttribute("userId", "hong123");
            // 클라이언트의 요펑이 없더라도 세션을 유지할 시간을 초 단위로 설정함
            session.setMaxInactiveInterval(10);
        %>

        <div style="border: 1px solid;">
            세션 ID : <%=session.getId()%><br>
            isNew : <%=session.isNew()%><br>
            생성 시간 : <%=new Date(session.getCreationTime())%><br>
            최종 접속 시간 : <%=new Date(session.getLastAccessedTime())%><br>
            userId : <%= session.getAttribute("userId")%>
        </div>

        <h4>2) Cookie란?</h4>
        <p>
            쿠키란 클라이언트 측에서 관리되는 정보를 의미<br>
            쿠키는 클라이언트와 서버 간의 상태를 유지시켜주는 역할을 함<br>
        </p>

        <%
            // 서버에서 쿠키 생성 후 클라이언트로 전송하는 방법
            Cookie cookie = new Cookie("user-name", "gildong");

            cookie.setMaxAge(10);

            response.addCookie(cookie);

            // 클라이언트에서 서버로 전송한 쿠키를 얻어오는 방법
            Cookie[] cookies = request.getCookies();

            Arrays.stream(cookies).forEach(c -> {
                System.out.println(c.getName());
                System.out.println(c.getValue());
                System.out.println();
            });
        %>

    <h3>5. application</h3>
    <p>
        웹 애플리케이션의 실행 환경을 제공하는 서버의 정보와 서버 측 지원에 대한 정보를 저장하고 있는 객체
    </p>

    <table border="1">
        <tr>
            <td>컨테이너 정보</td>
            <td><%=application.getServerInfo()%></td>
        </tr>
        <tr>
            <td>웹 모듈 버전</td>
            <td><%=application.getMajorVersion()%>.<%=application.getMinorVersion()%></td>
        </tr>
        <tr>
            <td>웹 애플리케이션의 실제 파일 시스템 경로</td>
            <%--
                <td><%=application.getRealPath("/")%></td>
            --%>
            <td><%=application.getRealPath("/views/error/error404.jsp")%></td>
        </tr>
    </table>


</body>
</html>
