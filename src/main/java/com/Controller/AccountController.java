package com.Controller;

import com.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/account")
    public Double queryAccount(@RequestParam Integer accountId) {
        return accountService.queryAccount(accountId);
    }

//    @GetMapping("/deposit")
//    public Account deposit(@RequestParam String accountId, @RequestParam double amount) {
//        return accountService.deposit(accountId, amount);
//    }

//    @GetMapping("/withdraw")
//    public Account withdraw(@RequestParam String accountId, @RequestParam double amount) {
//        return accountService.withdraw(accountId, amount);
//    }
}
