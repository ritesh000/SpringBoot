package com.springbootdb.springbootdb.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootdb.springbootdb.model.condidatedetails;

@Repository
public interface condidateDetailesrepositry extends CrudRepository<condidatedetails, Integer> {
 
	
	condidatedetails findById(int id);
	condidatedetails findBylastname(String lastname);
}
