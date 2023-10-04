<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <div>
    <h3>정적 자원 확인하기</h3>
    <!-- Mapping을 변경한 것이 아니기 때문에, contextPath 뒤에 resources, image, image 폴더 안의 .jpg 파일 하나.-->
    <img src="${contextPath}/resources/image/animal1.jpg"  width="192px">
  </div>
   
</body>
</html>