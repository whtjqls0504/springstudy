package com.gdu.app03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController02 {

  // Spring 4 버전 이후 사용 가능한 @RequestMapping
  // 1. @GetMapping
  // 2. @PostMapping
  
  @GetMapping(value="/notice/list.do")
  public String boardList() {
    
    // ViewResolver의 prefix : /WEB-INF/views/
    // ViewResolver의 suffix : .jsp
    return "notice/list";  // /WEB-INF/views/board/list
  }
  
  // 반환이 없는 경우에는 요청 주소를 Jsp 경로로 인식한다.
  // /member/list.do 요청을 /member/list.jsp 경로로 인식한다.
  // /member/list    요청을 /member/list.jsp 경로로 인식한다.
  @GetMapping(value = "/member/list.do")
  public void memberList() {
    // 반환값. void = 반환 없음 이므로 비워주기.
    
  }
  
  
  
  
}
