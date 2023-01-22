package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.AccountException;
import com.masai.exception.InsufficientFundException;
//import com.masai.exception.StudentException;
import com.masai.model.Account;
import com.masai.model.AccountDTO;
//import com.masai.model.Student;
import com.masai.repo.AccountDao;
@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountDao da;
	@Override
	public Account openAccount(Account acc) throws AccountException {
		Account newAccount = da.save(acc);
		
		return newAccount;
	}

	@Override
	public Account closeAccount(Integer accno) throws AccountException {
		Optional<Account>optional = da.findById(accno);
		if(optional.isEmpty()) {
			throw new AccountException("no object found");
		}else {
			Account deleAccount = optional.get();
			da.delete(deleAccount);
			return deleAccount;
		}
	}

	@Override
	public Account depositAmount(Integer accno, Integer amount) throws AccountException {
		Account existingaccount = da.findById(accno).orElseThrow(()-> new AccountException("Accoutn does not exist with the acc number "+accno));
		
		existingaccount.setBalance(existingaccount.getBalance()+amount);
		
		return da.save(existingaccount);
	}

	@Override
	public Account withdrawAmount(int accno, Integer amount) throws AccountException, InsufficientFundException {
Account existingaccount = da.findById(accno).orElseThrow(()-> new AccountException("Accoutn does not exist with the acc number "+accno));
		if(existingaccount.getBalance()>=1000) {
			existingaccount.setBalance(existingaccount.getBalance()-amount);
			return da.save(existingaccount);
		}else {
			throw new InsufficientFundException("balance sholud be more than or equal to 1000 ");
		}
		
		
		
	}

	@Override
	public String transferAmount(AccountDTO dto) throws AccountException, InsufficientFundException {
		// TODO Auto-generated method stub
		return null;
	}

}	