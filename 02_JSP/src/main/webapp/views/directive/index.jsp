
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>



<html>
<head>
    <title>지시자 태그</title>
</head>
<body>

    <%@include file="/views/common/header.jsp"%>
    <main style="height: 65%; background-color: cornflowerblue;">
        <form action="userFormResult.jsp" method="post">
            <label for="userName">이름: </label>
            <input type="text" id="userName" name="userName" >

            </br>

            <label for="age">나이: </label>
            <input type="text" id="age" name="userAge" >

            </br>

            <lable><input type="radio"  name="gender" value="남자"checked/>남자</lable>
            <lable><input type="radio"  name="gender" value="여자"/>여자</lable>


            </br>

            <lable >좋아하는 음식: </lable>
            <lable><input type="checkbox" name="food" value="한식">한식</lable>
            <lable><input type="checkbox" name="food" value="중식">중식</lable>
            <lable><input type="checkbox" name="food" value="일식">일식</lable>
            <lable><input type="checkbox" name="food" value="양식">양식</lable>
            <lable><input type="checkbox" name="food" value="분식">분식</lable>

            </br>
            </br>

            <input type="submit" value="전송">
            <input type="reset" value="취소">

        </form>

    </main>
    <%@include file="../common/footer.jsp"%>


</body>
</html>
