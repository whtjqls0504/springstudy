package com.gdu.myhome.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class UploadDto {
  private int uploadNo;
  private String title;
  private String contents;
  private String createdAt;
  private String modifiedAt;
  
  // user_no > fk 설정한 친구, private int userNo 대체제.
  private UserDto userNo;
}
