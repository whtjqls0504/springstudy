package com.gdu.app04.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MvcController {
  
  // DispatcherServlet(servlet-context.xml)에서 ViewResolver를 제거했으므로 jsp의 전체 경로를 모두 작성해야한다. 
  
  
  @RequestMapping(value = "/", method=RequestMethod.GET)  // /로 적어주면 http://localhost:8080/app04/ 경로를 의미한다.
  public String main() {
    // main.jsp로 이동시키는 controller
    return "/WEB-INF/main.jsp";
  }
  
}
