<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
</head>
<body>
  <!-- 목록보기 란-->
  <h1>목록보기</h1>
  
  <div>
    <a href="${contextPath}/write.do">새 글작성</a>
  </div>
 
  <br><hr><br>
  
  <h3>전체개수 : ${total}</h3>

  <!-- 게시글 리스트 -->   
  <div>
    <table border="1">
      <thead>
        <tr>
          <td>글 번호</td>
          <td>작성자</td>
          <td>제목</td>
          <td>내용</td>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${boardList}" var="board">
          <tr>
            <td>${board.boardNo}</td>         
            <td>${board.writer}</td>         
            <td><a href="${contextPath}/detail.do?boardNo=${board.boardNo}">${board.title}</a></td>        
            <td>${board.contents}</td>   
          </tr>
        </c:forEach>
      </tbody>
    </table>
</div>

  <div class="paging">${paging}</div>
  
  <script>
  	$('.board').click((ev) =>{
  		let boardNo = $(ev.target).parent().data('boardNo');
  		location.href = '${contextPath}/detail.do?boardNo=' + boardNo;
  	})
    
  </script>
  
</body>
</html>