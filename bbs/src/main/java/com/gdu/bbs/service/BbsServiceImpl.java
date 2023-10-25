package com.gdu.bbs.service;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.gdu.bbs.dao.BbsMapper;
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
    
    String contextPath = request.getContextPath();
    
    int total = ;    // 전체 갯수 받아오기 
    
    int display = 10;
    
    myPageUtils.setPaging(page, total, display);
    
    
    
  }
  
  
  
}
