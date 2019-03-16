package com.kids.creatives.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kids.creatives.entities.Kid;
import com.kids.creatives.services.KidServices;

@RestController
@RequestMapping("/api")
public class KidController {
	
	@Autowired
	private KidServices kidServices;
	
	@GetMapping("/kids")
	public List<Kid> getKids(){
		return kidServices.kidsResults();
	}
	
	@GetMapping("/kids/{id}")
	public Kid getKid(@PathVariable int id) {
		Kid kid = kidServices.getKid(id);
		
		return kid;	
	}
	
	@PostMapping("/kids")
	public Kid addKid(@RequestBody Kid theKid) {
		theKid.setId(0);
		
		kidServices.saveKids(theKid);
		
		return theKid;
	}
	
	@PutMapping("/kids")
	public Kid updateKid(@RequestBody Kid upKid) {
		
	 kidServices.saveKids(upKid);
	 
	 return upKid;
		
		
	}

}
