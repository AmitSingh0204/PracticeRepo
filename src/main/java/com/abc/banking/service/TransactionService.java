package com.abc.banking.service;

import org.springframework.stereotype.Component;

import com.abc.banking.exceptions.TransactionFailedException;
import com.abc.banking.exceptions.TransactionNotFoundException;
import com.abc.banking.model.Transaction;

@Component
public interface TransactionService {
	Transaction addTransaction(Transaction transaction) throws TransactionFailedException;
	Transaction getTransaction(long transId) throws TransactionNotFoundException;

}
