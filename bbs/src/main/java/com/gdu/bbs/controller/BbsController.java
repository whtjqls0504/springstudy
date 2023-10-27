package com.gdu.bbs.controller;

import javax.servlet.http.HttpServletRequest;import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gdu.bbs.dto.BbsDto;
import com.gdu.bbs.service.BbsService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class BbsController {

  private static final String removeResult = null;
  // select는 model에 저장한 뒤 forward한다.
  // @RequiredArgsCostructor >>>> final field용 생성자 선언
  // 같은 이름으로 최대한 사용하자.
  private final BbsService bbsService;    
  
  // 목록 페이지로 넘어가는 Controller Method가 실행된다.
  @GetMapping("/list.do")
  public String list(HttpServletRequest request, Model model) {
    bbsService.loadBbsList(request, model);   // bbsService의 loadBbsList에서의 model값을 가져와라.
    return "/bbs/list";
  }
  
  // select는 model에 저장한 뒤 forward한다.
  @GetMapping("/detail.do")
  // 단점이라고 하면 null 포인트 설정이 어렵다는 점이다. 
  // 오류 회피를 위한 3가지 단계
  // @RequestParam(value 변수, required = 필수 여부, defaultValue = 디폴트 값) 변수타입 변수이름, Model model
  // 이 값은 ?bbsNo=' + bbsNo 의미한다.
  public String detail(@RequestParam(value = "bbsNo", required = false, defaultValue = "0") int bbsNo
                        , Model model) {
    BbsDto bbs = bbsService.getBbs(bbsNo); 
    model.addAttribute("bbs", bbs);
    return "bbs/detail";    /// 오류 이유 : /WEB-INF/views/bbs/detail.jsp로 이동
    // model은 select를 저장하기 위해서 사용한다^^^^^ 제발 기어갷 조서빈ㅉ ㄹㅇ닝ㄹ ㅣㅓㅁㄴ이ㅏ러미ㅏ러 ㅁ닝러 
  }
  
  // insert는 redirectAttributes
  // BbsDto를 가지고 Commend 객체를가져오면 참 ~~~ 좋을거같다! (인정ㅋㅋ)
  @PostMapping("/add.do")
  public String add(BbsDto bbs, RedirectAttributes attr) {
    int addResult = bbsService.addBbs(bbs);
    attr.addFlashAttribute("addResult", addResult);
    return "redirect:/list.do";
  }
  
  // update는 redirectAttribute에 저장한 뒤 redirect 한다.
  @PostMapping("/modify.do")
  public String modify(BbsDto bbs, RedirectAttributes attr) {
    int modifyResult = bbsService.modify(bbs);
    attr.addFlashAttribute("modifyResult", modifyResult);
    return "redirect:/detail.do?bbsNo=" + bbs;
  }
  
  // delete는 redirectAttribute에 저장한 뒤 redirect 한다.
  @PostMapping("/remove.do")
  public String remove(@RequestParam(value = "bbsNo", required = false, defaultValue = "0") int bbsNo
                        , RedirectAttributes attr) {
    BbsDto bbs = bbsService.getBbs(bbsNo);
    attr.addFlashAttribute("removeResult", removeResult);
    return "redirect:/detail.do";
  }
  
}
