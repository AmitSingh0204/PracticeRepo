package com.abc.banking.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.abc.banking.dao.CustomerRepository;
import com.abc.banking.exceptions.CustomerAlreadyExistException;
import com.abc.banking.exceptions.CustomerDetailNotFoundException;
import com.abc.banking.model.Customer;

import jakarta.persistence.EntityNotFoundException;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) throws CustomerAlreadyExistException {
		// TODO Auto-generated method stub
		Customer newCustomer = customerRepository.save(customer);

		return newCustomer;
	}

	@Override
	public boolean deleteCustomer(long custId) throws CustomerDetailNotFoundException {
		// TODO Auto-generated method stub
		customerRepository.deleteById((int)custId);
		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) throws CustomerDetailNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer getCustomerById(long custId) throws CustomerDetailNotFoundException {
		// TODO Auto-generated method stub
		return customerRepository.findCustById(custId)
				.orElseThrow(() -> new EntityNotFoundException("Customer not found with ID: " + custId));
	}

}
