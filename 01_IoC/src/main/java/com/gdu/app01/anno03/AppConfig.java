package com.gdu.app01.anno03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public Student student() {
    
    Student student = new Student();
    // subjects List
    student.setSubjects(Arrays.asList("국어", "영어", "수학"));
    
    // contacts Set
    student.setContacts(new HashSet<String>(Arrays.asList("010-0000-0000", "031-9999-9999")));
    
    // friends Map
    student.setFriends(Map.of("동네친구", "패티", "학교친구", "에디", "사회친구", "포비"));
    return student;
  }
  
  
}
