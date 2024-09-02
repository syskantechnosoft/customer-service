package com.verizon.customerservice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.verizon.customerservice.model.Account;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1")
public class AccountController {
    private List<Account> accountList;

    AccountController() {
        accountList= new ArrayList<Account>();
        accountList.add(new Account(100,100,"savings","SA9878675645",20000.00,3.5f));
        accountList.add(new Account(101,100,"current","CA0978675667",5000.00,0.0f));
        accountList.add(new Account(102,100,"loan","LA9878675645",100000.00,8.7f));
        accountList.add(new Account(103,101,"savings","SA9867231243",7000.00,3.5f));
        accountList.add(new Account(104,101,"loan","LA98078675645",20000.00,9.5f));
    }
    
    @GetMapping("/accounts")
    public List<Account> getMethodName() {
        return accountList;
    }

    @GetMapping("/accounts/{id}")
    public Account getAccountById(@PathVariable int id){
        Account acc = new Account();
        for (Account account : accountList) {
            if (id==account.getId()){
                acc= account;
            }
        }
        return acc;
    }

    @GetMapping("/customer/{cid}/accounts")
    
    public List<Account> getMethodName(@PathVariable int cid) {
        List<Account> accounts = new ArrayList<Account>();
        for (Account account : accountList) {
            if (cid==account.getCId()){
                accounts.add(account);
            }
        }
        return accounts;
    }
    
}
