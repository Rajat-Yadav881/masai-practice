package com.SBI.dao;

import com.SBI.model.Account;

public interface stateBankDAO {
    Account findAccountById(int id);
    String saveAccount(Account account);
    String deleteAccountById(int id);
    String withdrawFromAccount(double amount,int accountId);
    String depositInAccount(double amount,int accountId);
}
