package com.gfa.hellobeanworld.controllers;

import com.gfa.hellobeanworld.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsefulUtilitiesController {

  UtilityService service;

  @Autowired
  UsefulUtilitiesController(UtilityService service) {
    this.service = service;
  }

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/useful/colored")
  public String colored(Model model) {
    model.addAttribute("color", service.randomColor());
    return "colored";
  }

}
