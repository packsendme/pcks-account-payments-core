package com.packsendme.cross.payment.dao;

import java.util.List;

public interface ICrud<T> {
	
	public Iterable<T> findAllById(String value);
	public T save(T entity);
	public List<T> findAll();
	public void delete(String id);


}
