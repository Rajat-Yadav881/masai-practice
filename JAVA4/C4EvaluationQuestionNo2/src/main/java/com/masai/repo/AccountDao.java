package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.masai.model.Account;
import com.masai.model.AccountDTO;

public interface AccountDao extends JpaRepository<Account, Integer>{

	public String gettransferAmount(AccountDTO dtos);
}
