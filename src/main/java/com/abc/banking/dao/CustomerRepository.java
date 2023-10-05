package com.abc.banking.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abc.banking.model.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	/*
	 * Customer save(Customer customer);
	 * 
	 * Customer update(Customer customer);
	 * 
	 * boolean delete(long custId);
	 */
	
	Optional<Customer> findCustById(long custId);
}
