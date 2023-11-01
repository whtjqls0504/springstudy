package com.goodee.app.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.goodee.app.dto.BoardDto;

@Mapper
public interface BoardMapper {

  public List<BoardDto> getBoardList(Map<String, Object> map);
  public int getBoardCount();
  public BoardDto getBoard(int boardNo);
  public int insertBoard(BoardDto board);
  public int updateBoard(BoardDto board);
  public int removeBoard(int boardNo);

}
