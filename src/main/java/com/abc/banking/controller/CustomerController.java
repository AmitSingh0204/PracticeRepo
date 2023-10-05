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

import com.abc.banking.exceptions.CustomerAlreadyExistException;
import com.abc.banking.exceptions.CustomerDetailNotFoundException;
import com.abc.banking.model.Customer;
import com.abc.banking.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService custService;
	/*
	 * @Autowired private AccountController accountController;
	 */

	@PostMapping("/addCustomer")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer)
			throws CustomerAlreadyExistException {
		custService.addCustomer(customer);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		// accountController.createAccount(customer.getAcctID(), 0, "Active");
	}

	@GetMapping("/getCustomer/{custID}")
	public ResponseEntity<Customer> getCustomerInfo(@PathVariable Long custID) throws CustomerDetailNotFoundException {
		Customer customer = custService.getCustomerById(custID);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

	@DeleteMapping("/deleteCustomer/{custID}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable Long custId) throws CustomerDetailNotFoundException {
		//boolean custDelStatus = custService.deleteCustomer(custId);
		return new ResponseEntity<Customer>(HttpStatus.OK);
	}

	@PutMapping("/updateCustomer/{custID}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer)
			throws CustomerAlreadyExistException, CustomerDetailNotFoundException {
		custService.updateCustomer(customer);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		// accountController.createAccount(customer.getAcctID(), 0, "Active");
	}

}
