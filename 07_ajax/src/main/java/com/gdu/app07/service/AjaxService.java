package com.gdu.app07.service;

import java.util.List;

import com.gdu.app07.dto.AjaxDto;

public interface AjaxService {
  public List<AjaxDto> getDtoList();   // List의 DtoList 받아오기
  public AjaxDto getDto(String name);       // 번호 받아오기
}
