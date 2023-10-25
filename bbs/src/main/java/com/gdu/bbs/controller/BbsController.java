package com.gdu.bbs.controller;

import org.springframework.stereotype.Controller;

import com.gdu.bbs.service.BbsService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class BbsController {

  // @RequiredArgsCostructor >>>> final field용 생성자 선언
  // 같은 이름으로 최대한 사용하자.
  private final BbsService bbsService;    
  
}
