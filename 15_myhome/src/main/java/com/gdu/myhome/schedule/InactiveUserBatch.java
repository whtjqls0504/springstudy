package com.gdu.myhome.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.gdu.myhome.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class InactiveUserBatch {

  private final UserService userService;
  
  // 매일 9시 26분에 동작
  @Scheduled(cron="0 31 9 1/1 * ?") 
  public void execute() {
    userService.inactiveUserBatch();
  }
  
}
