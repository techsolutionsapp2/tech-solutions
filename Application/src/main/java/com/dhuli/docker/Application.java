package com.dhuli.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

  @RequestMapping("/")
  public String home() {
    return "Hello Docker World new Changes";
    //freated feature 1 branch and using testing 
   //feature 1 -2
   //feature 2
    //feature 5 
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
