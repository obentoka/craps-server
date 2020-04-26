package com.vl.craps.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BalanceAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long balanceAccountId;
}
