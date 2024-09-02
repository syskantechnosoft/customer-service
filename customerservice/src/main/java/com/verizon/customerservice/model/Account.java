package com.verizon.customerservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private int id;
    private int cId;
    private String accountType;
    private String accountNumber;
    private double balance;
    private float intRate;
}
