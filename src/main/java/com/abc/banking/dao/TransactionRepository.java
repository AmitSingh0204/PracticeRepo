package com.abc.banking.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abc.banking.model.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Integer>{
	/*
	 * Transaction save(Transaction transaction);
	 * 
	 * Transaction update(Transaction customer);
	 * 
	 * boolean delete(long transId);
	 */

	Optional<Transaction> findTransById(long transId);
}
