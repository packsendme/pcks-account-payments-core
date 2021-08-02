package com.packsendme.cross.payment.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
@Document(collection = "pcks_cross_methodpay")
public class MethodPayment  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;
	public String name_method;
	public String name_entity;
	public String firstName;
	public String lastName;
	public int number;
	public int cvc;
	public int expireMonth;
	public int expireYear;
	
	public MethodPayment(String id, String name_method, String name_entity, String firstName, String lastName,
			int number, int cvc, int expireMonth, int expireYear) {
		super();
		this.id = id;
		this.name_method = name_method;
		this.name_entity = name_entity;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.cvc = cvc;
		this.expireMonth = expireMonth;
		this.expireYear = expireYear;
	}

	public MethodPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}
