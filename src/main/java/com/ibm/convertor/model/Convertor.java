package com.ibm.convertor.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Convertor {
	
	@Id
	private String countryCode;
	private  int converstionFactor;

}
