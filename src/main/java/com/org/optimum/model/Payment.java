package com.org.optimum.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Payment {

    @Id
    private int paymentId;
    private String paymentPersonName;
    private String paymentBankName;
    private double paymentAmountTransfer;

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentPersonName() {
        return paymentPersonName;
    }

    public void setPaymentPersonName(String paymentPersonName) {
        this.paymentPersonName = paymentPersonName;
    }

    public String getPaymentBankName() {
        return paymentBankName;
    }

    public void setPaymentBankName(String paymentBankName) {
        this.paymentBankName = paymentBankName;
    }

    public double getPaymentAmountTransfer() {
        return paymentAmountTransfer;
    }

    public void setPaymentAmountTransfer(double paymentAmountTransfer) {
        this.paymentAmountTransfer = paymentAmountTransfer;
    }
}
