package com.payment.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payment.model.Payment;

@Repository
public interface PayRepos extends JpaRepository<Payment, Integer> {
  Payment getByPaymentId(int paymentId);
	
}
