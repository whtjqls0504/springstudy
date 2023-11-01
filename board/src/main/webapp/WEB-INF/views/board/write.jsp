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

<!-- 작성란 -->
<h1>작성화면</h1>

<div>
  <form id="frm_add" method="post" action="${contextPath}/add.do">
    <div>
      <div><input   type="text" name="writer" id="writer" placeholder="작성자"></div>
      <div><input   type="text" name="title" id="title" placeholder="제목"></div>
      <div><input   type="text" name="contents" id="contents" placeholder="내용"></div>
      <div><button  type="submit">등록하기</button></div>
    </div>
  </form>
</div>

<script>
	$('#frm_add').submit((ev) => {
		let title = $('#title');
		/* 제목을 작성하지 않았을경우. */
		if(title.val() == ''){
			alert('제목은 필수입니다!');
			title.focus();
			ev.preventDefault();
			return;	// 반환
		}
	})
	
	const addResult = '${addResult}';  // '', '1', '0'
    if(addResult !== ''){
    	if(addResult === '1'){
    		alert('추가 성공');
    	} else {
    		alert('추가 실패');
    	}
    }
    
    const removeResult = '${removeResult}';  // '', '1', '0'
    if(removeResult !== ''){
    	if(removeResult === '1'){
    		alert('삭제 성공');
    	} else {
    		alert('삭제 실패');
    	}
    }

</script>


</body>
</html>