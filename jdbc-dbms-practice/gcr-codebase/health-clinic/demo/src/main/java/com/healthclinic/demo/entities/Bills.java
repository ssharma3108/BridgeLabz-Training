package com.healthclinic.demo.entities;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Bills {
    private int bill_id;
    private int visit_id;
    private  double total_amount;
    private String payment_status;
    private LocalDate paynment_date;
    private LocalDateTime created_at;

    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public int getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(int visit_id) {
        this.visit_id = visit_id;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    public LocalDate getPaynment_date() {
        return paynment_date;
    }

    public void setPaynment_date(LocalDate paynment_date) {
        this.paynment_date = paynment_date;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
}
