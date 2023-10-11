package com.org.optimum.service;

import com.org.optimum.model.Payment;
import com.org.optimum.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepo paymentRepo;
    @Override
    public void createPayment(Payment payment) {
        paymentRepo.save(payment);
    }

    @Override
    public void updatePayment(Payment payment) {
        paymentRepo.save(payment);
    }

    @Override
    public List<Payment> getAllInTable() {
        List<Payment> list=   paymentRepo.findAll();
        return list;
    }

    @Override
    public Optional<Payment> getById(Integer paymentId) {
        Optional<Payment> pay=   paymentRepo.findById(paymentId);
        return pay;
    }

    @Override
    public String deleteById(Integer paymentId) {
        paymentRepo.deleteById(paymentId);
        return "Successfully";
    }
}
