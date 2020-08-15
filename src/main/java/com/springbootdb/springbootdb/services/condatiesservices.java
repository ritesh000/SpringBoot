package com.springbootdb.springbootdb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootdb.springbootdb.model.condidatedetails;
import com.springbootdb.springbootdb.repositry.condidateDetailesrepositry;

@Service
public class condatiesservices implements condiateservices {

	@Autowired
	condidateDetailesrepositry condidateDetailesrepositryinter;
	
	public condidatedetails savedatauser(condidatedetails condidatedetailsmodel) {
		
		return condidateDetailesrepositryinter.save(condidatedetailsmodel);
	}

	public List<condidatedetails> gelallcondatedetails() {
		return (List<condidatedetails>) condidateDetailesrepositryinter.findAll();
		
		
	}

	@Override
	public condidatedetails gelidcondatedetails(int id) {
		
		return  condidateDetailesrepositryinter.findById(id);
	}

	@Override
	public condidatedetails gelnamecondatedetails(String lastname) {
		
		return condidateDetailesrepositryinter.findBylastname(lastname);
	}

	@Override
	public condidatedetails updateuser(condidatedetails condidatedetailsmodel) {
		
		return condidateDetailesrepositryinter.save(condidatedetailsmodel);
	}

	@Override
	public void deleteuserid(int id) {
		
         condidateDetailesrepositryinter.deleteById(id);
	}

	
	
	

	
	
}
