package com.gfa.programmerfoxclub.Controller;

import com.gfa.programmerfoxclub.Model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private Fox fox1;

  @Autowired
  public MainController(Fox fox1) {
    this.fox1 = fox1;
  }

  @GetMapping("/")
  public String firstPage() {
    return "index";
  }

  @GetMapping("/login")
  public String loginForm(Model model, @ModelAttribute(name = "fox") Fox fox) {
    model.addAttribute("fox", fox);
    return "login";
  }

  @PostMapping("/")
  public String addName(@RequestParam String nameInput, Model model) {
    fox1.setName(nameInput);
    model.addAttribute("name", fox1.getName());
    return "redirect:/index";
  }
}
