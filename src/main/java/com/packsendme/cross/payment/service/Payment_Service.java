package com.packsendme.cross.payment.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.packsendme.cross.payment.component.LoadDataFacadeImpl;
import com.packsendme.cross.payment.dao.PaymentImpl_Dao;
import com.packsendme.cross.payment.dto.MethodPayListResponse_Dto;
import com.packsendme.cross.payment.dto.MethodPayment_Dto;
import com.packsendme.lib.common.response.Response;
 

@Service
public class Payment_Service {
	
	
	@Autowired(required=true)
	private PaymentImpl_Dao paymentDAO;

	
	public ResponseEntity<?> searchMethodPaymentClient(String clientID, Map header) {
		Response<MethodPayListResponse_Dto> responseObj = null;
		PaymentImpl_Dao<MethodPayment_Dto> paymentDAO = new PaymentImpl_Dao<MethodPayment_Dto>();
		
		try {
			// Load Data From API or Cache
			MethodPayListResponse_Dto methodPayDto_Obj = paymentDAO.findAllById(clientID)
			InstanceRuleCosts instanceRulesObj = new  InstanceRuleCosts();
			
			// Instance JAR - Costs Calculate 
			SimulationRoadwayResponse simulationRoadwayResp = instanceRulesObj.instanceRulesCosts(simulationDataDto_Obj);
			
			responseObj = new Response<SimulationRoadwayResponse>(0,HttpExceptionPackSend.SIMULATION_ROADWAY.getAction(), simulationRoadwayResp);
			return new ResponseEntity<>(responseObj, HttpStatus.OK);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			responseObj = new Response<SimulationRoadwayResponse>(0,HttpExceptionPackSend.SIMULATION_ROADWAY.getAction(), null);
			return new ResponseEntity<>(responseObj, HttpStatus.BAD_REQUEST);
		}
	}
	
	public ResponseEntity<?> generatePay(String value,String clientID,MethodPayment_Dto methodPaymentDto,Map header) {
		Response<String> responseObj = null;
		try {
			// Save SimulationDAO
			simulationDAO.save(entity);
			responseObj = new Response<SimulationRoadwayResponse>(0,HttpExceptionPackSend.SIMULATION_ROADWAY.getAction(), null);
			return new ResponseEntity<>(responseObj, HttpStatus.OK);
		}
		catch (Exception e) {
			// TODO: handle exception
			responseObj = new Response<SimulationRoadwayResponse>(0,HttpExceptionPackSend.SIMULATION_ROADWAY.getAction(), null);
			return new ResponseEntity<>(responseObj, HttpStatus.BAD_REQUEST);
		}
	}
		
}
