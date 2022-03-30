package com.springboot.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springboot.pojo.Accounts;
import com.springboot.pojo.Message;
import com.springboot.repository.AccountsRepository;

@Service(value = "accountsService")
public class AccountsServiceImpl implements AccountsService{

	@Autowired
	private AccountsRepository accountsRepository;
	
	
	@Override
	public List<Accounts> getAllAccounts() {
		return this.accountsRepository.findAll();
	}

	@Override
	public Accounts getAccount(String accountNumber) {
		List<Accounts> list = this.accountsRepository.getAccountByAccountNumber(accountNumber);
		if(list.size() == 0) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public boolean isNetBankingReg(String accountNumber) {
		List<Accounts> list = this.accountsRepository.findAll();
		for(Accounts account : list) {
			if(account.getAccountNumber().equals(accountNumber)) {
				if(account.getAccountIsNetBankingReg() == 0) {
					return false;
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public void putAccount(Accounts account) {
		this.accountsRepository.save(account);
	}
	
	//public Message createAccount(Accounts accounts) {
	//	Message response = new Message();
	//	boolean flag = true;
	//	String message = "Registration Succesful";
		
	//	if(AccountNoAlreadyExists(accounts.getAccountNumber())) {
	//		message = "account already Exists";
	//		flag = false;
	//	}
	//	if(flag) {				
	//		accountsRepository.save(accounts);
	//	}
		
		//response.setMessage(message);
		//response.setAccountNumber(accounts.getAccountNumber());
	//	return response;
	//}
	//@Override
	//public boolean AccountNoAlreadyExists(String AccountNumber) {
	//	try {
	///		accounts u=accountsRepository.findByUsername(AccountNumber);
	//		System.out.println(u.toString());
	//		return true;
	//	} catch (Exception e) {
	//	}
	//	return false;
	//}
}
