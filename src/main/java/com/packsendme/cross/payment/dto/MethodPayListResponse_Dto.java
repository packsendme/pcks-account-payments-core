package com.packsendme.cross.payment.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class MethodPayListResponse_Dto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public List<MethodPayment_Dto> methodPaymentResponseL = new ArrayList<MethodPayment_Dto>();

	public MethodPayListResponse_Dto(List<MethodPayment_Dto> methodPaymentL) {
		super();
		this.methodPaymentResponseL = methodPaymentL;
	}
	
	
}
