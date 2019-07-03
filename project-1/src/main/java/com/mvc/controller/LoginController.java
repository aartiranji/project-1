package com.mvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

  @RequestMapping("/")
  public String index() {
    return "Hello World!!!";
  }
  
  @RequestMapping("/ab")
  public String index2() {
    return "hello.html";
  }
 
//  @RequestMapping("/register")
//  public String register{
//	    return "Hello World!!!";  
//  }

  @RequestMapping("/register")
  public String register() {
    return "Hello World!!!";
  }
 

}