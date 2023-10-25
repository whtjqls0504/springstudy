package com.gdu.bbs.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.gdu.bbs.dto.BbsDto;

@Mapper
public interface BbsMapper {

  // 얘가 부르는 xml은 전부다 resources에 두기로 약속했다
  public List<BbsDto> getBbsList(Map<String, Object> map);
  // begin, end를 다시 넣기
  
}
