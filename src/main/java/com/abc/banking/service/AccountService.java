package com.abc.banking.service;

import org.springframework.stereotype.Component;

import com.abc.banking.exceptions.AccountNotFoundException;
import com.abc.banking.exceptions.CustomerDetailNotFoundException;
import com.abc.banking.exceptions.InsufficientBalanceException;
import com.abc.banking.exceptions.TransactionFailedException;
import com.abc.banking.model.Account;


public interface AccountService {
	Account addAccount(Account account) throws CustomerDetailNotFoundException;
	boolean deleteAccount(long accId) throws AccountNotFoundException;
	boolean updateAccount(Account account) throws AccountNotFoundException;
	Account getAccountDetails(long accId) throws AccountNotFoundException;
	Account getAllAccountDetails();
	double withdrawAmount(long accId, double amount) throws InsufficientBalanceException, AccountNotFoundException, TransactionFailedException;
	double depositAmount(long accId, double amount) throws AccountNotFoundException, TransactionFailedException;
	double getAccountBalance(long accId) throws AccountNotFoundException;
	boolean fundTransfer(long accId1, long accId2, double amount) throws AccountNotFoundException, InsufficientBalanceException, TransactionFailedException;

}
