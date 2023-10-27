<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
</head>
<style>
  .bbs{
    width: 300px;
    border: 1px solid gray;
    cursor: pointer;
  }

</style>
<body>

  <h1>작성화면</h1>
  
  <!-- 작성자 란 만들기-->
  <div>
    <form id="frm_add" method="post" action="${contextPath}/add.do" >
      <div><input type="text" name="editor" id="editor" placeholder="작성자"></div>
      <div><input type="text" name="title" id="title" placeholder="제목"></div>       <!-- title에 속성추가하기 -->
      <div><input type="text" name="contents" id="contents" placeholder="내용"></div>
      <div><button type="submit">등록하기</button></div>
    </form>
  </div>
  
  <br>
  <hr>
  <br>
  
  <h1>목록화면</h1>
  <h3>전체개수 : ${total}</h3>
  <c:forEach items="${bbsList}" var="bbs">
    <div class="bbs" data-bbs_no="${bbs.bbsNo}">    <!-- onclick의 함수 -->
      <div>${bbs.bbsNo}</div>
      <div>${bbs.title}</div>
    </div>
  </c:forEach>
  <div class="paging">${paging}</div>

  <script>
  	$('.bbs').click((ev) => {
  		// 클릭한  대상 : 이벤트 대상 (이벤트 객체의 target 속성)		
  		let bbsNo = $(ev.target).parent().data('bbs_no');
  		// Get 방식
  		location.href = '${contextPath}/detail.do?bbsNo=' + bbsNo;	//.bss 클래스를 클릭 시 bbs_no로 location.href에 설정한 링크로 이동한다.
  	})  
  	
  	$('#frm_add').submit((ev) => {
  		let title  = $('#title');
  		if(title.val() == ''){				// title이 val(값)이 ''아무것도 없는값이라면,
  			alert('제목은 필수입니다.');
  			title.focus();
  			ev.preventDefault();			// 이벤트 종료
  			return;
  		}
  		
  	})
  	
  	const addResult = '${addResult}';
  	if(addResult!== ''){
  	  	if(addResult === '1'){
  	  		alert('추가 성공');
  	  	} else {
  	  		alert('추가 실패');
  	  	}	
  	}

  	
  </script>
</body>
</html>