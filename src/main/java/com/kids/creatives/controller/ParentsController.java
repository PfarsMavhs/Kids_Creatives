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

import com.kids.creatives.entities.Parents;
import com.kids.creatives.services.ParentsServices;

@RestController
@RequestMapping("/api")
public class ParentsController {
	
	
	@Autowired
	private ParentsServices parentService;
	
	@GetMapping("/parents")
	public List<Parents> getAllParents(){
		return  parentService.getParents();
	}
	
	@GetMapping("/parents/{parentId}")
	public Parents getParent(@PathVariable int parentId) {
		
		return parentService.getParent(parentId);
		
	}
	
	@PostMapping("/parents")
	public Parents saveParents(@RequestBody Parents parent) {
		
		parent.setUserId(0);
		
		 parentService.addParents(parent);
		 
		 return parent;
	}
	
	@PutMapping("/parents")
	public Parents updateParents(@RequestBody Parents parent) {
		parentService.addParents(parent);
		
		return parent;
	}
	

}
