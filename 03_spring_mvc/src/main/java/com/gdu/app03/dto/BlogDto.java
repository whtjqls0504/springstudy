package com.gdu.app03.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BlogDto {
  private int blogNo;     // 블로그번호
  private String title;   // 블로그제목
}
