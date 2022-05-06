package com.bank.spring.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    private AccountType type;

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "create_date")
    private LocalDate creatingDate;

    @Column(name = "status")
    private AccountStatus status;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
}
