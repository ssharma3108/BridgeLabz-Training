package com.healthclinic.demo.entities;

public class Doctors {
    private int doctor_id;
    private String name;
    private double contact;
    private double consultation_fee;
    private int specialty_id;
    private boolean is_active;

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getContact() {
        return contact;
    }

    public void setContact(double contact) {
        this.contact = contact;
    }

    public double getConsultation_fee() {
        return consultation_fee;
    }

    public void setConsultation_fee(double consultation_fee) {
        this.consultation_fee = consultation_fee;
    }

    public int getSpecialty_id() {
        return specialty_id;
    }

    public void setSpecialty_id(int specialty_id) {
        this.specialty_id = specialty_id;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }
}
