<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
</head>
<style>
  
</style>
<body>
  
  <h1>작성 화면</h1>
  
  <!-- 작성자 란 만들기 -->
  <div>
    <form id="frm_add" method="post" action="${contextPath}/add.do">
      <div><input type="text" name="editor"   id="editor"   placeholder="작성자"></div>
      <div><input type="text" name="title"    id="title"    placeholder="제목"></div>
      <div><input type="text" name="contents" id="contents" placeholder="내용"></div>
      <div><button type="submit">등록하기</button></div>
    </form>
  </div>
  
  <br>
  <hr>
  <br>
  
  <h1>목록화면</h1>
  <h3>전체개수 : ${total}</h3>
  <c:forEach items="${cbcList}" var="cbc">
    <div class="cbc" data-cbc_no="${cbc.cbcNo}">
      <div>${cbc.cbcNo}</div>
      <div>${cbc.title}</div>
    </div>
  </c:forEach>
  <div class="paging">${paging}</div>

  <script>
  	$('.cbc').click((ev) => {
  		let cbcNo = $(ev.target).parent().data('cbc_no');
  		location.href = '${contextPath}/detail.do?cbcNo=' + cbcNo;
  	})
  	
  	$('#frm_add').submit((ev) => {
  		let title = $('#title');
  		if(title.val() == ''{
  			alert('제목은 필수입니다.');
  			title.focus();
  			ev.preventDefault();
  			return;
  		})
  	})
  	
  	// 게시글 추가에 대한 script이다. 
  	const addResult = '${addResult}';
  	if(addResult == ''){
  		if(addResult === '1'){
  			alert('추가 성공');
  		} else {
  			alert('추가 실패');
  		}
  	}
  
  </script>

</body>
</html>