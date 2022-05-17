package com.bank.spring.controller;

import com.bank.spring.entity.Account;
import com.bank.spring.entity.dto.AccountDto;
import com.bank.spring.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    @GetMapping
    public ResponseEntity<List<AccountDto>> getAllAccounts() {
        List<Account> accounts = accountService.getAllAccounts();
        List<AccountDto> accountsDto = accounts.stream().map(AccountDto::from).collect(Collectors.toList());
        return new ResponseEntity<>(accountsDto, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable final Long id) {
        Account account = accountService.getAccountById(id);
        return new ResponseEntity<>(AccountDto.from(account), HttpStatus.OK);
    }

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
        return account;
    }
}
