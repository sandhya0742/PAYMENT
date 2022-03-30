package com.payment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.common.PaymentModel;
import com.payment.model.Payment;
import com.payment.repos.PayRepos;
import com.payment.service.PaymentService;

@RestController
@RequestMapping("/api")
public class PayCOntroller {

	@Autowired
	private PaymentService serve;
	
	@Autowired
	private PayRepos repo ;

//http://localhost:8087/api/addPaymentAtOnBoarding
//ADDING PAYMENT AT ONBOARDING TIME .
	@PostMapping("/addPaymentAtOnBoarding")
	public Payment addPayment(@RequestBody Payment payment) {
		return this.serve.addPayment(payment);
	}

//http://localhost:8087/api/updatePaymentByPaymentId/{paymentId}
//UPDATING PAYMENT BASED ON PAYMENT ID.
	@PutMapping("/updatePaymentByPaymentId/{paymentId}")
	public Payment updatePayment(@RequestBody Payment payment) {
		return this.serve.updatePayment(payment);
	}

//	http://localhost:8087/api/getPaymentDetail/{paymentId}
//RETRIEVE PAYMENT DETAILS BASED ON PAYMENT ID .
	@GetMapping("/getPaymentDetail/{paymentId}")
	public Payment getPaymentById(@PathVariable int paymentId) {
		return this.serve.getPaymentById(paymentId);
	}

//http://localhost:8087/api/getAllPayments
//RETRIEVE ALL PAYMENTS AS LIST .
	@GetMapping("/getAllPayments")
	public List<Payment> getPayment() {
		return this.serve.getPayment();
	}
	
	
	@GetMapping("/getTransactionHistoryById/{paymentId}")
	public PaymentModel getByPaymentId(@PathVariable int  paymentId) {
	//public List<PaymentModel>  getByPaymentId()	
		PaymentModel pm=new PaymentModel();
		Payment payment = repo.getByPaymentId(paymentId) ;
            pm.setTransactionId(payment.getTransactionId());
            pm.setTransactionDate(payment.getTransactionDate());
		return pm;
		
	}
	

	// GET THE TRANSACTION HISTORY BASED ON GUESTID .
	@GetMapping("/getTransactionHistoryByGuestId/{guestId}")
	public List<Payment> findByGuestId(@PathVariable String guestId) {
		return this.serve.getPaymentByGuestId(guestId);
	}
//http://localhost:8087/api/getDuesAmounts/{guestId}
//FETCHING DUE AMOUNT BASED ON GUESTID .
	@GetMapping("/getDuesAmounts/{guestId}")
	public double getDueAmountByGuestId(String guestId) {
		return this.serve.getDueAmountByGuestId(guestId);
	}

//POSTING INFORMATION OF PAYMENT BASED ON GUEST TYPE .
	@PostMapping("/recordPayment")
	public Payment recordPayment(@RequestBody Payment payment) {
		return this.serve.recordPayment(payment);
	}
}
