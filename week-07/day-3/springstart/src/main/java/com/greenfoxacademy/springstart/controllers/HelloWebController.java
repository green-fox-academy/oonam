package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  static AtomicLong atomicLong2 = new AtomicLong(1);

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam String nameByUser) {

    model.addAttribute("cntr", atomicLong2.getAndIncrement());
    model.addAttribute("name", nameByUser);

    return "greeting";
  }
}
