package com.healthclinic.demo.entities;

import java.time.LocalDateTime;

public class Visits {
    private int visit_id;
    private int appointment_id;
    private String diagnosis;
    private String notes;
    private LocalDateTime visit_date;

    public int getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(int visit_id) {
        this.visit_id = visit_id;
    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDateTime getVisit_date() {
        return visit_date;
    }

    public void setVisit_date(LocalDateTime visit_date) {
        this.visit_date = visit_date;
    }
}
