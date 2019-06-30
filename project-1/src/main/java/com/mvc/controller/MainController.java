package com.mvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @RequestMapping("/")
  //@ResponseBody
  public String index() {
    return "Hello World!!!";
  }
  
  @RequestMapping("/ab")
  public String index2() {
    return "hello.html";
  }


}