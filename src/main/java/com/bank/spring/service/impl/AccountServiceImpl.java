package com.bank.spring.service.impl;

import com.bank.spring.entity.Account;
import com.bank.spring.entity.User;
import com.bank.spring.repository.AccountRepository;
import com.bank.spring.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public Account saveAccount(Account account) {
        accountRepository.save(account);
        return account;
    }

    @Override
    public void deleteAccount(Account account) {

    }

    @Override
    public Account getAccountById(Long id) {
        Account account = null;
        Optional<Account> optionalAccount = accountRepository.findById(id);
        if (optionalAccount.isPresent()) {
            account = optionalAccount.get();
        }
        return account;
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
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
