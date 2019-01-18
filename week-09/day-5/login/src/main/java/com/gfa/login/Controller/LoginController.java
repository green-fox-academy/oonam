package com.gfa.login.Controller;

import com.gfa.login.Model.Login;
import com.gfa.login.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

  LoginService service;

  @Autowired
  public LoginController(LoginService service) {
    this.service = service;
  }

  @GetMapping("/")
  public String addUser(Model model) {
    model.addAttribute("login", new Login());
    return "login";
  }

  @PostMapping("/")
  public String addNewTodo(@ModelAttribute Login login) {
    service.addLogin(login);
    return "redirect:/login/";
  }
}
