package com.springboot.service;

import java.util.List;

import com.springboot.pojo.Accounts;
import com.springboot.pojo.Message;

public interface AccountsService {

	public List<Accounts> getAllAccounts();
	public Accounts getAccount(String accountNumber);
	public boolean isNetBankingReg(String accountNumber);
	public void putAccount(Accounts account);
	//public Message createAccount(Accounts account);
	
}
