package com.gdu.app06.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gdu.app06.dao.BoardDao;
import com.gdu.app06.dto.BoardDto;

public class BoardServiceImpl implements IBoardService {

  private BoardDao boardDao;
  
  // Setter 넣기 
  @Autowired
  public void setBoardDao(BoardDao boardDao) {
    this.boardDao = boardDao;
  }
  
  
  /* iBoardService interface 가져온거 */
  @Override
  public List<BoardDto> getBoardList() {
    // TODO Auto-generated method stub
    return boardDao.getBoardList();
  }


  @Override
  public BoardDto getBoardByNo(int boardNo) {
    // TODO Auto-generated method stub
    return boardDao.getBoardByNo(boardNo);
  }

}
