package com.demo.revolut.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Account implements Serializable {
    @Id
    @GeneratedValue
    Long id;

    String number;
    BigDecimal balance;
}
