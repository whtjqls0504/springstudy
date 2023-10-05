package com.gdu.app07.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gdu.app07.dao.AjaxDao;
import com.gdu.app07.dto.AjaxDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AjaxServiceImpl implements AjaxService {

  // Dao1 final 처리 -> 생성자 처리하기.
  private final AjaxDao ajaxDao;
  
  
  @Override
  // Dto1 list
  public List<AjaxDto> getDtoList() {
    return ajaxDao.getDtoList();
  }

  @Override
  // Dto1 no 
  public AjaxDto getDto(String name) {
   int no = 0;
   if(name.equals("뽀로로")) {
     no = 1;
   } else if(name.equals("루피")) {
     no = 2;
   } else if(name.equals("크롱")) {
     no = 3;
   }
    return ajaxDao.getDto(no);
  }

}
