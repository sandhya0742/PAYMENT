package com.payment.service;

import java.util.List;

//import static java.text.NumberFormat.getCurrencyInstance;
//import javax.persistence.Enumerated;

import com.payment.model.Payment;

public interface PaymentService {

//1. Fetching  the details of payments for all guests .	
	public List<Payment> getPayment();

	// 2. Fetching Payment Details By Particular GuestId
	public List<Payment> getPaymentByGuestId(String guestId);

//3.Fetching payments details by paymentId .
	public Payment getPaymentById(int paymentId);

	// 4. Method to Updating data of payment history by manager .
	public Payment updatePayment(Payment payment);

	// 5. Method to Call at the time when user is OnBoarding .
	public Payment addPayment(Payment payment);

	// 6. Getting the dues Of particular Guest based on their id .
	public double getDueAmountByGuestId(String guestId);

//7.Posting the data of Guest After onBOarding .
	public Payment recordPayment(Payment payment);

	// double getDailyRent() ;

	// double getMonthlyRent () ;

	// default String getFormattedDailyRent () {
	// return getCurrencyInstance().format(getDailyRent()) ;
	// }

	// default String getFormattedMonthlyRent () {
	// return getCurrencyInstance().format(getDailyRent()) ;
	// }

}
