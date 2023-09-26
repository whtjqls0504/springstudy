package com.gdu.app02.anno01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Member {
  
  // 계산기
  private Calculator calculator;
  
  private String name;      // 이름
  private double height;    // cm
  private double weight;    // kg
  private double bmi;       // weight / (height * height / 10000)
  private String status;    // <20 : 저체중, <25: 정상, <30 : 과체중, 나머지: 비만
  
}
