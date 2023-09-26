package com.gdu.app02.anno02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MyJdbcService {

  private MyJdbcDao myJdbcDao;
  
  public void add() {
    myJdbcDao.add();
  }
 
  
}
