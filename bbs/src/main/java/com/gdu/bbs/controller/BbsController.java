package com.gdu.bbs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gdu.bbs.service.BbsService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class BbsController {

  // @RequiredArgsCostructor >>>> final field용 생성자 선언
  // 같은 이름으로 최대한 사용하자.
  private final BbsService bbsService;    
  
  // 목록 페이지로 넘어가는 Controller Method가 실행된다.
  @GetMapping("/bbs/list.do")
  public String list(HttpServletRequest request, Model model) {
    bbsService.loadBbsList(request, model);   // bbsService의 loadBbsList에서의 model값을 가져와라.
    return "/bbs/list";
  }
  
}
