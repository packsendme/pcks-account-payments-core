package com.packsendme.cross.payment.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mongodb.MongoClientException;
import com.packsendme.cross.payment.repository.IRepository;

@Repository
@Transactional
public class PaymentImpl_Dao<T> implements ICrud<T> {

	@Autowired
	IRepository<T> repository;

	@Override
	public Iterable<T> findAllById(String value) {
		try {
			Iterable<String> iterable = Arrays.asList(value);
			Iterable<T> queryResult = repository.findAllById(iterable);
			return queryResult;
		}
		catch (MongoClientException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public T save(T entity) {
		try {
			return repository.insert(entity);
		}
		catch (MongoClientException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<T> findAll() {
		try {
			return repository.findAll();
		}
		catch (MongoClientException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void delete(String id) {
		try {
			repository.deleteById(id);
		}
		catch (MongoClientException e) {
			e.printStackTrace();
		}		
	}

 
}
