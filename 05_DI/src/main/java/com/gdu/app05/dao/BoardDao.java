package com.gdu.app05.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.gdu.app05.dto.BoardDto;

@Repository // Dao 전용 @Component, BoardDao boardao 객체를 Contai
public class BoardDao {

  public List<BoardDto> getBoardList(){
    return Arrays.asList(
        new BoardDto("제목1", "작성자1"), 
        new BoardDto("제목2", "작성자2"),
        new BoardDto("제목3", "작성자3")
    );   
  }
}
