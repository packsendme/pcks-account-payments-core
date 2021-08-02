package com.packsendme.cross.payment.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter

public class MethodPayment_Dto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String name_method;
	public String name_entity;
	public String firstName;
	public String lastName;
	public int number;
	public int cvc;
	public int expireMonth;
	public int expireYear;
	
}
