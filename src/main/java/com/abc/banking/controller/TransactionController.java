package com.abc.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.banking.exceptions.AccountNotFoundException;
import com.abc.banking.exceptions.CustomerAlreadyExistException;
import com.abc.banking.exceptions.CustomerDetailNotFoundException;
import com.abc.banking.exceptions.TransactionFailedException;
import com.abc.banking.exceptions.TransactionNotFoundException;
import com.abc.banking.model.Transaction;
import com.abc.banking.service.TransactionService;

@RestController
public class TransactionController {
	@Autowired
	private TransactionService transService;

	@PostMapping("/addTransaction")
	public ResponseEntity<Transaction> createCustomer(@RequestBody Transaction transaction)
			throws CustomerAlreadyExistException, TransactionFailedException {
		transService.addTransaction(transaction);
		return new ResponseEntity<Transaction>(transaction, HttpStatus.OK);
		// accountController.createAccount(customer.getAcctID(), 0, "Active");
	}

	@GetMapping("/getTransaction/{transId}")
	public ResponseEntity<Transaction> getTransactionInfo(@PathVariable Long transId)
			throws CustomerDetailNotFoundException, AccountNotFoundException, TransactionNotFoundException {
		Transaction trans = transService.getTransaction(transId);
		return new ResponseEntity<Transaction>(trans, HttpStatus.OK);
	}
	// Transaction addTransaction(Transaction transaction) throws
	// TransactionFailedException;
	// Transaction getTransaction(int transId) throws TransactionNotFoundException;
}
