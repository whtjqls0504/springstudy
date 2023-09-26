package com.gdu.app02.anno01;

import java.util.Arrays;

import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public Calculator calc() {
    return new Calculator();
  }
  
  // Member 
  @Bean
  public Member member() {
    Member m = new Member();
    m.setName("홍길동");
    m.setHeight(170.5);
    m.setWeight(60);
    m.setCalculator(calc());
    
    double w = m.getWeight(); // 체중 w 선언
    double h = m.getHeight(); // 신장 h 선언
    
    Calculator c = m.getCalculator(); 
    m.setBmi(c.div(w, c.div(c.mul(h, h), 10000))); // <20 : 저체중, <25: 정상, <30 : 과체중, 나머지: 비만

    double bmi = m.getBmi();
    m.setStatus(bmi < 20 ? "저체중" : bmi < 25 ? "정상" : bmi< 30 ?  "과체중" : "비만");
    
    return m;
    
    }
    
  
  // Fitness
  @Bean
  public Fitness fitness() {
    Fitness f = new Fitness();
    f.setName("가산피트니스");
    f.setMembers(Arrays.asList(member()));
    
    return f;
  }
  
  
  
}
