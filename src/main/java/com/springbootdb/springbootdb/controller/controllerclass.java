package com.springbootdb.springbootdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdb.springbootdb.model.condidatedetails;
import com.springbootdb.springbootdb.services.condatiesservices;

@RestController
@RequestMapping("/delaites")
public class controllerclass {

	@Autowired
	condatiesservices servicesinterface;

	@RequestMapping("/getmethod")
	String getname() {
		return "hello ritesh !!!";
	}

	@PostMapping("/savedatauser")
	public condidatedetails savedatauser(@RequestBody condidatedetails controllersave) {

		condidatedetails details = servicesinterface.savedatauser(controllersave);
		return details;

	}

	@GetMapping("/allcondiate")
	public List<condidatedetails> gelallcondatedetails() {

		List<condidatedetails> datalist = servicesinterface.gelallcondatedetails();
		return datalist;

	}

	@GetMapping("/allcondiate/{id}")
	public condidatedetails getidcondatedetails(@PathVariable int id) {

		condidatedetails dataid = servicesinterface.gelidcondatedetails(id);
		return dataid;

	}

	@GetMapping("/allcondiate/name/{lastname}")
	public condidatedetails getidcondatedetails(@PathVariable String lastname) {

		condidatedetails dataname = servicesinterface.gelnamecondatedetails(lastname);
		return dataname;

	}

	@PutMapping("/updateuserdetails")
	public condidatedetails updateuser(@RequestBody condidatedetails controllersave) {

		condidatedetails detauser = servicesinterface.updateuser(controllersave);
		return detauser;

	}
   
	@DeleteMapping("/deletuser/{id}")
	public void deleteandid(@PathVariable int id)
	{
		servicesinterface.deleteuserid(id);
	}
	
	
}
