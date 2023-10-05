package com.gdu.app50.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MvcController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index() {
    return "index";     // index으로 넘기는거.
  }
  
}
