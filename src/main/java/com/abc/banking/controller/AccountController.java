package com.abc.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.banking.exceptions.AccountNotFoundException;
import com.abc.banking.exceptions.CustomerAlreadyExistException;
import com.abc.banking.exceptions.CustomerDetailNotFoundException;
import com.abc.banking.model.Account;
import com.abc.banking.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	private AccountService acctService;
	/*
	 * @Autowired private AccountController accountController;
	 */

	@PostMapping("/addAccount")
	public ResponseEntity<Account> createAccount(@RequestBody Account account) throws CustomerDetailNotFoundException {
		acctService.addAccount(account);
		return new ResponseEntity<Account>(account, HttpStatus.OK);
		// accountController.createAccount(customer.getAcctID(), 0, "Active");
	}

	@GetMapping("/getAccount/{accId}")
	public ResponseEntity<Account> getAccountInfo(@PathVariable Long acctId) throws CustomerDetailNotFoundException, AccountNotFoundException {
		Account account = acctService.getAccountDetails(acctId);
		return new ResponseEntity<Account>(account, HttpStatus.OK);
	}

	@DeleteMapping("/deleteAccount/{acctId}")
	public ResponseEntity<Account> deleteCustomer(@PathVariable Long acctId)
			throws CustomerDetailNotFoundException, AccountNotFoundException {
		//boolean acctDelStatus = acctService.deleteAccount(acctId);
		return new ResponseEntity<Account>( HttpStatus.OK);
	}

	@PutMapping("/updateAccount/{accId}")
	public ResponseEntity<Account> updateAccount(@RequestBody Account account)
			throws CustomerAlreadyExistException, CustomerDetailNotFoundException, AccountNotFoundException {
		acctService.updateAccount(account);
		return new ResponseEntity<Account>(account, HttpStatus.OK);
		// accountController.createAccount(customer.getAcctID(), 0, "Active");
	}
}
