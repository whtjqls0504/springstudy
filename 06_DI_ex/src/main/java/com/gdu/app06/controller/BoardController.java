package com.gdu.app06.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gdu.app06.service.IBoardService;

@RequestMapping(value = "/board")  //  /blog로 시작하는 요청을 처리하는 컨트롤러가 된다.
// 모든 메소드의 요청에 "/blog"가 자동으로 삽입된다.



@Controller
public class BoardController {

  // IBoardService 
  private IBoardService iBoardService;

  // IBoardService의 Setter 추가  + AutoWired
  @Autowired
  public void setiBoardService(IBoardService iBoardService) {
    this.iBoardService = iBoardService;
  } 

 /********* list로 이동할놈**********/
  @RequestMapping(value = "/board/list.do", method=RequestMethod.GET)
  public String list(Model model) {
    // list(목록)을 가져온 뒤 목록을 보내주는 역할을 수행한다 parameter 값을 model로 설정한다. 왜???   
    model.addAttribute("boardList", iBoardService.getBoardList());
 
    // 아래 경로로 값을 반환한다.
    return "board/list";  // /WEB-INF/views/board/list.jsp
  } 
  
  // boardNo는 jsp에 넘어와야한다.
  // requestParam을 사용해 번호 사용.
  @RequestMapping(value = "/board/detail.do", method=RequestMethod.GET)
  public String detail(@RequestParam(value = "boardNo", required = false, defaultValue="0") int boardNo
                      , Model model) {
    
   model.addAttribute("board", iBoardService.getBoardByNo(boardNo));
   return "board/detail"; // /WEB-INF/views/board/detail.jsp
  }
}
