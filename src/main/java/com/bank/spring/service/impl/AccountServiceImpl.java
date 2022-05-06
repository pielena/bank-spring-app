package com.bank.spring.service.impl;

import com.bank.spring.entity.Account;
import com.bank.spring.entity.User;
import com.bank.spring.repository.AccountRepository;
import com.bank.spring.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;


public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account saveAccount(Account account) {
        return null;
    }

    @Override
    public void deleteAccount(Account account) {

    }

    @Override
    public User getAccountById(Long id) {
        return null;
    }

    @Override
    public List<Account> getAllAccounts() {
        return null;
    }

    @Override
    public List<Account> getAccountsByUser(User user) {
        return null;
    }

    @Override
    public Account getMainAccountByUser(User user) {
        return null;
    }
}
