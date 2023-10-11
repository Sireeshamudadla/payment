package com.org.optimum.controller;

import com.org.optimum.model.Payment;
import com.org.optimum.repository.PaymentRepo;
import com.org.optimum.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    //CRUD
   @PostMapping("/create")
    public void createPayment(@RequestBody Payment payment){
       paymentService.createPayment(payment);
   }
    @PutMapping ("/update")
    public void updatePayment(@RequestBody Payment payment) {
        paymentService.updatePayment(payment);
    }
   @GetMapping("/getAll")
    public List<Payment> getAllInTable(){
       List<Payment> list=   paymentService.getAllInTable();
       return list;
   }

    @GetMapping("/getById/{paymentId}")
    public Optional<Payment> getById(@PathVariable Integer paymentId) {
        Optional<Payment> pay=   paymentService.getById(paymentId);
        return pay;

    }
    @DeleteMapping("/removeId/{paymentId}")
    public String deleteById(@PathVariable Integer paymentId ){
        paymentService.deleteById(paymentId);
        return "Successfully";
    }
}
