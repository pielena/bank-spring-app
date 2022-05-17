package com.bank.spring.entity;

import com.bank.spring.entity.dto.AccountDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "user")
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "account_type")
    private AccountType type;

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "create_date")
    private LocalDateTime creatingDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private AccountStatus status;

    @ManyToOne
    private User user;

    public static Account from(AccountDto accountDto) {
        Account account = new Account();
        account.setType(accountDto.getType());
        account.setBalance(accountDto.getBalance());
        account.setCreatingDate(accountDto.getCreatingDate());
        account.setStatus(accountDto.getStatus());
        return account;
    }
}
