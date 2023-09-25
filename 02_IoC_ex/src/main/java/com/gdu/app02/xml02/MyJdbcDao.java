package com.gdu.app02.xml02;

import java.sql.Connection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyJdbcDao {

  private Connection con;
  
  public Connection getConnection() {
    // 반환값 : MyJdbcConnection 클래스의 getConnection() 메소드 호출
    AbstractApplicationContext ctx = new GenericXmlApplicationContext("xml02/appCtx.xml");
    
    MyjdbcConnection myjdbcConnection = ctx.getBean("myJdbcConnection", MyjdbcConnection.class);
    ctx.close();      // 닫기
    return myjdbcConnection.getConnection();  // 반환하기
  }
  
  private void close() {
    try {
      if(con != null)
        con.close();
      System.out.println("GD 접속 해제");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  
  // 하고싶은 작업들을 설정해 주는게 Dao.
  
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
