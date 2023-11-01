package com.gdu.myhome.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AttachDto {

  private int attachNo;
  private String path;
  private String originalFilename;
  private String filesystemName;
  private int downloadCount;
  private int hasThumbnail;
  private int uploadNo;
  
}
