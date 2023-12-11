package com.Service;

public interface AccountService {

    //查询账户余额
    Double queryAccount(Integer accountId);

    //转账
    int updateAccount(String fromName,String toName,double amount);
}
