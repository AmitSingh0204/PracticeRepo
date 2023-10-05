package com.abc.banking.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.abc.banking.dao.AccountRepository;
import com.abc.banking.dao.CustomerRepository;
import com.abc.banking.exceptions.AccountNotFoundException;
import com.abc.banking.exceptions.CustomerDetailNotFoundException;
import com.abc.banking.exceptions.InsufficientBalanceException;
import com.abc.banking.exceptions.TransactionFailedException;
import com.abc.banking.model.Account;
import com.abc.banking.model.Customer;

public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private TransactionService transactionService;
	
	@Override
	public Account addAccount(Account account) throws CustomerDetailNotFoundException {
		// TODO Auto-generated method stub

		account.setCustomer(customer);

		return accountRepository.save(account);
	}

	@Override
	public boolean deleteAccount(long accId) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAccount(Account account) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account getAccountDetails(long accId) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAllAccountDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double withdrawAmount(long accId, double amount)
			throws InsufficientBalanceException, AccountNotFoundException, TransactionFailedException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double depositAmount(long accId, double amount) throws AccountNotFoundException, TransactionFailedException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getAccountBalance(long accId) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean fundTransfer(long accId1, long accId2, double amount)
			throws AccountNotFoundException, InsufficientBalanceException, TransactionFailedException {
		// TODO Auto-generated method stub
		return false;
	}

}
