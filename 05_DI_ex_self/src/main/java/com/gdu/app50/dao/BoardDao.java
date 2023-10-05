package com.gdu.app50.dao;

import java.util.Arrays;
import java.util.List;

import com.gdu.app50.dto.BoardDto;

public class BoardDao {

  private BoardDto boardDto1;
  private BoardDto boardDto2;
  private BoardDto boardDto3;
  
  // 생성자 선언
  public BoardDao(BoardDto boardDto1, BoardDto boardDto2, BoardDto boardDto3) {
    super();
    this.boardDto1 = boardDto1;
    this.boardDto2 = boardDto2;
    this.boardDto3 = boardDto3;
  }
  
  // list 선언으로 게시글 목록 관리하기
  public List<BoardDto> getBoardList(){
    return Arrays.asList(boardDto1, boardDto2, boardDto3);
  }
  
  // 반환 타입 및 번호 관리할 if문 생성하기.
  // int boardNo
  public BoardDto getBoardByNo(int boardNo) {
    BoardDto boardDto = null;
    
    if(boardDto1.getBoardNo() == boardNo) {
      boardDto = boardDto1;
    } else if(boardDto2.getBoardNo() == boardNo) {
      boardDto = boardDto2;
    } else if(boardDto3.getBoardNo() == boardNo) {
      boardDto = boardDto3;
    }
  
    return boardDto;
  
  }
  
  
}
