package com.gdu.bbs.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.gdu.bbs.dto.BbsDto;

public interface BbsService {

  // 추상메소드를 만들고 구현 -> Impl
  // HttpServletRequest 받는 이유 > getParameter(page), getContextPath()
  // Service에 Model 넣는 이유 > Service 스스로가 저장하게끔~ 
  public void loadBbsList(HttpServletRequest request, Model model);
  public BbsDto getBbs(int bbsNo);
  public int addBbs(BbsDto bbs);
  public int modify(BbsDto bbs);
  public int remove(BbsDto bbs);
  
}
