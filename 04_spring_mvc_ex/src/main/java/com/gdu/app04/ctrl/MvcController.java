package com.gdu.app04.ctrl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gdu.app04.vo.ArticleVo;

@Controller
public class MvcController {
  
  // DispatcherServlet(servlet-context.xml)에서 ViewResolver를 제거했으므로 jsp의 전체 경로를 모두 작성해야한다. 
  
  
  @RequestMapping(value = "/", method=RequestMethod.GET)  // /로 적어주면 http://localhost:8080/app04/ 경로를 의미한다.
  public String main() {
    // main.jsp로 이동시키는 controller
    return "/WEB-INF/main.jsp";
  }
  
  @RequestMapping(value = "/write.do", method = RequestMethod.GET)
  public String write() {
    return "/WEB-INF/article/write.jsp";
  }
  
  //@RequestMapping(value = "/register.do", method=RequestMethod.POST)
  public String register(HttpServletRequest request) {
    int articleNo = Integer.parseInt(request.getParameter("articleNo"));
    String title =  request.getParameter("title");
    String content = request.getParameter("content");
    System.out.println(articleNo + ", "  + title + ", " + content);
    return "/WEB-INF/article/write.jsp";
  }
  
  //@RequestMapping(value = "/register.do", method=RequestMethod.POST)
  public String resgister2(@RequestParam(value = "articleNo") int articleNo
                         , @RequestParam(value="title") String title
                         , @RequestParam(value = "content") String content) {
    System.out.println(articleNo + "," + title + "," + content);
    return "/WEB-INF/article/write.jsp";  
  }
  
  @RequestMapping(value = "/register.do", method = RequestMethod.POST)
  public String register3(ArticleVo vo) {
    System.out.println(vo);
    return "/WEB-INF/article/write.jsp";
  }
}
