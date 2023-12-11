package com.Service.Impl;

import com.DTO.Account;
import com.Mapper.AccountMapper;
import com.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    //查询账户余额
    @Override
    public Double queryAccount(Integer accountId) {
        Account account = accountMapper.selectAccountById(accountId);
        Double balance = account.getBalance();
        System.out.println(balance);
        return balance;
    }

    //转账
    @Override
    public int updateAccount(String fromName, String toName, double amount) {
        int i = accountMapper.updateAccount(fromName,amount*(-1));
        System.out.println("借钱成功");
        int j = accountMapper.updateAccount(toName,amount);
        System.out.println("到账成功");
        return i+j;
    }
}
