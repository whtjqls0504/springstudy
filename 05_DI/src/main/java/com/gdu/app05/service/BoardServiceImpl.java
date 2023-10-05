package com.gdu.app05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.gdu.app05.dao.BoardDao;
import com.gdu.app05.dto.BoardDto;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // final field 전용 생성자,
                         // @Autowired를 이용한 생성자 주입을 위해 추가한다.
@Service // 서비스 객체(Business Layer)전용 @Component, Spring Container에 생성해둔다.
public class BoardServiceImpl implements BoardService {

  
  // 주입된 boardDao 객체의 변경 방지를 위해 final 처리한다.
  private final BoardDao boardDao;
  
//  // 살아나는건 생성자 뿐.
//  // @Autowired
//  public BoardServiceImpl(BoardDao boardDao) {
//    super();
//    this.boardDao = boardDao;
//  }
  
//  @Autowired
//  public void setBoardDao(BoardDao boardDao) {
//    this.boardDao = boardDao;
//  }
  
  @Override
  public List<BoardDto> getBoardList() {
    return boardDao.getBoardList();
  }



  
  
}
