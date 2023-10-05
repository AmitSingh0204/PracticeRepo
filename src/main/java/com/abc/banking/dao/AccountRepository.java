package com.abc.banking.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abc.banking.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer>{
	/*
	 * Account save(Account account);
	 * 
	 * Account update(Account account);
	 * 
	 * boolean delete(long accId);
	 */

	Optional<Account> findAccById(long id);
}
