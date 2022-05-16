package com.bank.spring.entity.dto;

import com.bank.spring.entity.Account;
import com.bank.spring.entity.AccountStatus;
import com.bank.spring.entity.AccountType;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
public class AccountDto {

    private Long id;
    private AccountType type;
    private BigDecimal balance;
    private LocalDateTime creatingDate;
    private AccountStatus status;
    private PlainUserDto plainUserDto;

    public static AccountDto from(Account account) {
        AccountDto accountDto = new AccountDto();
        accountDto.setId(account.getId());
        accountDto.setType(account.getType());
        accountDto.setBalance(account.getBalance());
        accountDto.setCreatingDate(account.getCreatingDate());
        accountDto.setStatus(account.getStatus());
        if (Objects.nonNull(account.getUser())) {
            accountDto.setPlainUserDto(PlainUserDto.from(account.getUser()));
        }
        return accountDto;
    }
}
