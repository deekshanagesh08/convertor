package com.ibm.convertor.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.convertor.model.Convertor;
import com.ibm.convertor.repository.ControllorRepository;



@RestController
@RequestMapping("/currency/conversion")
public class ConvertorController {
	
private static final Logger log = LoggerFactory.getLogger(ConvertorController.class);
	
	@Autowired
	private ControllorRepository repository;
	
	@PostConstruct
	public void init() {
		Convertor convertor = new Convertor();
		convertor.setCountryCode("INR");
		convertor.setConverstionFactor(100);
		log.debug("Add conversion data" +convertor);
		repository.save(convertor);
		
	}
	
	
	
	@GetMapping
	public ResponseEntity<List<Convertor>> getAll() {
		log.debug("ResponseEntitiy:" +ResponseEntity.status(200));
		return ResponseEntity.ok(repository.findAll());
		
	}
	
	@PostMapping
	public ResponseEntity<Convertor> addConvertor(@RequestBody Convertor convertor) {
		return ResponseEntity.ok(repository.save(convertor));
	}	
	
	
	@PutMapping
	public ResponseEntity<Convertor> updateConvertor(@RequestBody Convertor convertor) {
		return ResponseEntity.ok(repository.save(convertor));
	}
}
