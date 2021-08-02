package com.packsendme.cross.payment.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.packsendme.cross.payment.dto.MethodPayment_Dto;
import com.packsendme.cross.payment.service.Payment_Service;

import feign.Body;


@RestController
@RequestMapping("/cross/payment")
public class PaymentController {

	@Autowired
	private Payment_Service paymentService;

	private Map<String, String> header = new HashMap<String, String>();
	
	//@ModelAttribute
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/method")
	public ResponseEntity<?> getMethodPayment(
			@RequestHeader("isoLanguageCode") String isoLanguageCode, 
			@RequestHeader("isoCountryCode") String isoCountryCode,
			@RequestHeader("isoCurrencyCode") String isoCurrencyCode,
			@RequestHeader("originApp") String originApp,
			@Validated @PathParam("clientID") String clientID)
		throws JsonProcessingException, IOException 
	{	
		header.put("isoLanguageCode", isoLanguageCode);
		header.put("isoCountryCode", isoCountryCode);
		header.put("isoCurrencyCode", isoCurrencyCode);
		header.put("originApp", originApp);
		return paymentService.searchMethodPaymentClient(clientID,header);
	}
	
	//@ModelAttribute
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/pay")
	public ResponseEntity<?> postPayment(
			@RequestHeader("isoLanguageCode") String isoLanguageCode, 
			@RequestHeader("isoCountryCode") String isoCountryCode,
			@RequestHeader("isoCurrencyCode") String isoCurrencyCode,
			@RequestHeader("originApp") String originApp,
			@Validated @PathParam("value") String value,
			@Validated @PathParam("clientID") String clientID,
			@Validated @RequestBody MethodPayment_Dto methodPaymentDto)
		throws JsonProcessingException, IOException 
	{	
		header.put("isoLanguageCode", isoLanguageCode);
		header.put("isoCountryCode", isoCountryCode);
		header.put("isoCurrencyCode", isoCurrencyCode);
		header.put("originApp", originApp);
		return paymentService.generatePay(value,clientID,methodPaymentDto,header);
	}

	


}
