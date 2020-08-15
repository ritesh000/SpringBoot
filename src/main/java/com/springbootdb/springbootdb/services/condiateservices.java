package com.springbootdb.springbootdb.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootdb.springbootdb.model.condidatedetails;

@Service
public interface condiateservices {

	
	public condidatedetails savedatauser(condidatedetails condidatedetailsmodel);
	public List<condidatedetails> gelallcondatedetails();
	public condidatedetails gelidcondatedetails(int id);
	public condidatedetails gelnamecondatedetails(String lastname);
	
	public condidatedetails updateuser(condidatedetails condidatedetailsmodel);
	public void deleteuserid(int id);
}
