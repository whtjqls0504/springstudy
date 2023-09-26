package com.gdu.app02.anno02;

import org.springframework.context.annotation.Bean;

public class AppConfig {

  @Bean
  public MyJdbcConnection myJdbcConnection() {
    MyJdbcConnection myJdbcConnection = new MyJdbcConnection();
    myJdbcConnection.setDriver("oracle.jdbc.OracleDriver");
    myJdbcConnection.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:xe");
    myJdbcConnection.setUser("GD");
    myJdbcConnection.setPassword("111");
    return myJdbcConnection;
  }
  
  @Bean
  public MyJdbcDao myJdbcDao() {
    return new MyJdbcDao();
    // 바로 열고 닫아야하기 때문에, 바로 반환값을 준다?
  }
  
  @Bean
  public MyJdbcService myJdbcService() {
    return new MyJdbcService();
    // Dao가 이미 포함되어있기때문에 사용하지 않는것?
  }
  
}
