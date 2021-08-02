package com.packsendme.cross.payment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepository<T> extends MongoRepository<T, String>{

}

