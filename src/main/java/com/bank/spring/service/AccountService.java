package com.bank.spring.service;

import com.bank.spring.entity.Account;
import com.bank.spring.entity.User;

import java.util.List;

public interface AccountService {

    Account saveAccount(Account account);

    void deleteAccount(Account account);

    User getAccountById(Long id);

    List<Account> getAllAccounts();

    List<Account> getAccountsByUser(User user);

    Account getMainAccountByUser(User user);
}
