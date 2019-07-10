package cn.it.controller;


import cn.it.domain.Account;
import cn.it.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService as;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> list = as.findAll();
        model.addAttribute("list",list);
        return "accounts";

    }
}
