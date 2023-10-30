package com.gdu.cbc.dto;

import lombok.Data;

import java.sql.Date;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CbcDto {
  private int cbc_no;
  private String editor;
  private String title;
  private String contents;
  private Date created_at;
  private Date modified_at;
  
  
}
