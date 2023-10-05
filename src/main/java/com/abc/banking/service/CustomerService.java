package com.abc.banking.service;

import org.springframework.stereotype.Component;

import com.abc.banking.exceptions.CustomerAlreadyExistException;
import com.abc.banking.exceptions.CustomerDetailNotFoundException;
import com.abc.banking.model.Customer;


public interface CustomerService {
	Customer addCustomer(Customer customer) throws CustomerAlreadyExistException;
	boolean deleteCustomer(long custId) throws CustomerDetailNotFoundException;
	boolean updateCustomer(Customer customer) throws CustomerDetailNotFoundException;
	Customer getCustomerById(long custId) throws CustomerDetailNotFoundException;

}
