package com.gdu.bbs.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.gdu.bbs.dao.BbsMapper;
import com.gdu.bbs.dto.BbsDto;
import com.gdu.bbs.util.MyPageUtils;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BbsServiceImpl implements BbsService {

  private final BbsMapper bbsMapper;      // @Mapper
  private final MyPageUtils myPageUtils;  // @Component
  
  
  @Override
  public void loadBbsList(HttpServletRequest request, Model model) {
    // 파라미터 page를 감싸달라.
    Optional<String> opt = Optional.ofNullable(request.getParameter("page"));
    // 전달할 값 null > 1 반환
    String strPage = opt.orElse("1");       // "1" - > 1  (String > int)
    int page = Integer.parseInt(strPage);    
    int total = bbsMapper.getBbsCount();    // 전체 갯수 받아오기 > bbsMapper.xml의 getBbsCount
    
    int display = 10;
    
    myPageUtils.setPaging(page, total, display);
    
    // getBbsList의 begin/end 값
    Map<String, Object> map = Map.of("begin", myPageUtils.getBegin()
                                     ,"end", myPageUtils.getEnd());
   
    // bbsList > .jsp로 보내기
    List<BbsDto> bbsList = bbsMapper.getBbsList(map);
  
    model.addAttribute("bbsList", bbsList);
  
    // 얘는 MyPageUtils의 url 주소이다. 
    String contextPath = request.getContextPath();
    model.addAttribute("paging", myPageUtils.getMvcPaging(contextPath + "/bbs/list.do"));
    model.addAttribute("total", total);   
    
  }
  
  
  
}
