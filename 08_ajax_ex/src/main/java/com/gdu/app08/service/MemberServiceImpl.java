package com.gdu.app08.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdu.app08.dao.MemberDao;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor    // 생성자 주입(@Autowired)을 통해서 private final MemberDao memberDao; 에 Bean을 주입한다.
@Service                    // 얘를 해줘야 Component가 가져올 수 있다.
public class MemberServiceImpl implements MemberService {

  private final MemberDao memberDao; 
  
  @Override
  public Map<String, Object> getBmiInfo(int memberNo) {
    // TODO Auto-generated method stub
    return null;
  }


  
}
