package com.gdu.app02.anno02;

import java.sql.Connection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MyJdbcDao {

  // Connection을 가져올 객체
  private Connection con;
  private MyJdbcConnection myJdbcConnection;
  
  private Connection getConnection() {
    // myJdbcConnection으로부터 가져오면 되는데, 만들어져있는 bean을 넣으면 된다.
    AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    myJdbcConnection = ctx.getBean("myJdbcConnection", MyJdbcConnection.class);
    ctx.close();
    return myJdbcConnection.getConnection();
  }
  
  // 다른 메소드들도 닫을 수 있는 닫기 메소드
  private void close() {
    try {
      if(con != null) {
        con.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public void add() {
    con = getConnection();
    System.out.println("add() 호출");
    close();
  }
  public void remove() {
    con = getConnection();
    System.out.println("remove() 호출");
    close();
  }
  public void modify() {
    con = getConnection();
    System.out.println("modify() 호출");
    close();
  }
  public void select() {
    con = getConnection();
    System.out.println("select() 호출");
    close();
  }
  
  
  
  
}
