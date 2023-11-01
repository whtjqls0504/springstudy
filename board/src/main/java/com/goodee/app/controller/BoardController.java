package com.goodee.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.goodee.app.dto.BoardDto;
import com.goodee.app.service.BoardService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class BoardController {
  
  private final BoardService boardService;
  
  // 목록페이지(List)로 넘어가는 Controller method
  @GetMapping("/list.do")
  public String list(HttpServletRequest request, Model model) {
    boardService.loadBoardList(request, model);
    return "board/list";
  }
  
  @GetMapping("/write.do")
  public String write() {
    return "board/write";
  }
  
  // select > model에 저장한 뒤 forward하는 형식으로.
  @GetMapping("/detail.do")
  public String detail(@RequestParam(value = "boardNo", required = false, defaultValue = "0") int boardNo
                        , Model model) {
    BoardDto board = boardService.getBoard(boardNo);
    model.addAttribute("board", board);
    return "board/detail";
  }
  
  
  // 추가하고 list로 돌아가기
  @PostMapping("/add.do")
  public String add(BoardDto boardDto, RedirectAttributes attr) {
    int addResult = boardService.addBoard(boardDto);
    attr.addFlashAttribute("addResult", addResult);
    return "redirect:/list.do";
  }
  
  // 수정하고 detail로 돌아가기
  @PostMapping("/modify.do")
  public String modify(BoardDto boardDto, RedirectAttributes attr) {
    int modifyResult = boardService.modify(boardDto);
    attr.addFlashAttribute("modifyResult", modifyResult);
    return "redirect:/detail.do?boardNo=" + boardDto.getBoardNo();
  }
  
  
  // 상세창에서 삭제 누르면 삭제 후 목록보기
  @PostMapping("/remove.do")
  public String remove(@RequestParam(value = "boardNo", required = false, defaultValue = "0") int boardNo,
                        RedirectAttributes attr) {
    int removeResult = boardService.removeBoard(boardNo);
    attr.addFlashAttribute("removeResult", removeResult);
    return "redirect:/list.do";
  }
  
  
}
