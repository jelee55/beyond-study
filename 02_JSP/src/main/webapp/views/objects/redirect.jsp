
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%
    /*
        sendRedirect(String location)
          - 매개값으로 지정한 경로로 요청을 재전송함
          - 리다이렉트 방식은 이동할 페이지로 요청과 응답 객체를 새로 생성하여 전송하므로
            이전 요청과 응답 정보가 유지되지 않음
     */

    String contextPath = request.getContextPath();
    // response.sendRedirect("redirect_target.jsp");
    // response.sendRedirect("/jsp/view/object/redirect_target.jsp");
    response.sendRedirect(contextPath + "/views/objects/redirect_target.jsp");
%>