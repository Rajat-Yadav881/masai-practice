package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.AccountException;
import com.masai.model.Account;
import com.masai.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	private AccountService service;
	
	@PostMapping("/accounts")
	public ResponseEntity<Account> newAcountHandler(@RequestBody Account account){
		Account account2 = service.openAccount(account);
		
		return new ResponseEntity<Account>(account2,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/accounts/{id}")
	public ResponseEntity<Account> deleteAccounthandle(@PathVariable("id") Integer accno){
		Account account = service.closeAccount(accno);
		return new ResponseEntity<Account>(account,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/accounts")
	public ResponseEntity<Account> depositHandle(@PathVariable("id") Integer acc_id,@RequestParam("amount") Integer amount){
		Account account = service.depositAmount(acc_id, amount);
		return new ResponseEntity<Account>(account,HttpStatus.OK);
	}
	@PutMapping("/accounts")
	public ResponseEntity<Account> withdrawHandle(@PathVariable("id") Integer acc_id,@RequestParam("amount") Integer amount){
		Account account = service.withdrawAmount(acc_id, amount);
		return new ResponseEntity<Account>(account,HttpStatus.OK);
	}
	
}
