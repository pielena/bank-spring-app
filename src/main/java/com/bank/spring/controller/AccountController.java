package com.bank.spring.controller;

import com.bank.spring.entity.Account;
import com.bank.spring.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        List<Account> allAccounts = accountService.getAllAccounts();
        return allAccounts;
    }

    @GetMapping("/accounts/{id}")
    public Account getAccountById(@PathVariable Long id) {
        return accountService.getAccountById(id);
    }

    @PostMapping("/accounts")
    public Account createAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
        return account;
    }
}
