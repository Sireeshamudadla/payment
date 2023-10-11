package com.org.optimum.service;

import com.org.optimum.model.Payment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface PaymentService {
    public void createPayment( Payment payment);
    public void updatePayment( Payment payment);
    public List<Payment> getAllInTable();
    public Optional<Payment> getById( Integer paymentId);
    public String deleteById(Integer paymentId );

}
