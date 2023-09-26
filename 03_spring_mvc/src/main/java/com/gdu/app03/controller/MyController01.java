package com.gdu.app03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller     // 컨트롤러를 만드는 Annotation
public class MyController01 {

  /*
   * 요청/응답을 처리할 메소드를 만든다.
   * 
   * 
   * 1. 반환타입
   *  1) String : 응답할 Jsp의 이름을 반환한다. 
   *  2) void   : 컨트롤러가 호출한 서비스에서 직접 응답한다. 요청 주소를 Jsp 이름으로 인식한다.
   *  3) 기타   : 비동기 통신에서 데이터를 응답한다.
   * 2. 메소드명
   *  - 아무 일도 안 한다.
   * 3. 매개변수
   *  1) HttpServletRequest를 선언해서 사용할 수 있다.
   *  2) HttpServletResponse를 선언해서 사용할 수 있다.
   * 4. 요청(@RequestMapping)
   *  1) 메소드  : GET, POST
   *  2) URL     : 요청 주소
   */
  // get방식의 ContextPath요청이 있을때 아래 String welcome()을 열어라!
  // value="/" : contextPath 요청을 의미한다. http://localhost/app03/ 주소를 의미한다.
  @RequestMapping(value = "/", method=RequestMethod.GET)
  public String welcome() {
    // 경로 적는 방법. index.jsp의 경로이다.
    // ViewResolver의 prefix : /WEB-INF/views/
    // ViewResolver의 suffix : .jsp
    return "index";
  }
  @RequestMapping(value = "/a/b/c/d///list.do", method=RequestMethod.GET)
  public String boardList() {
    // ViewResolver의 prefix : /WEB-INF/views/
    // ViewResolver의 suffix : .jsp
    return "board/list";    // /WEB-INF/views/board/list.jsp
  }
  
}
