package com.greenfoxacademy.bankofsimba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

  private List<BankAccount> accounts = new ArrayList<>();

  public BankAccountController() {
    accounts.add(new BankAccount("Simba", 2000, "lion"));
    accounts.add(new BankAccount("Nala", 3000, "lion"));
    accounts.add(new BankAccount("Timon", 4000, "meerkat"));
    accounts.add(new BankAccount("Pumba", 6000, "warthog"));
    accounts.add(new BankAccount("Scar", 8000, "lion"));
  }

  @GetMapping("/show")
  public String showAccounts(Model model) {
    model.addAttribute("accounts", accounts);
    return "index";
  }

  @GetMapping("/print")
  public String printText(Model model) {
    model.addAttribute("printText", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "index";
  }

  @GetMapping("/table")
  public String listOfBankAccounts(Model model) {
    model.addAttribute("list", accounts);
    return "list";
  }
}
