package com.healthclinic.demo.dao;

import com.healthclinic.demo.entities.Doctors;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.BeanMetadataElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DoctorsDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


   @PostConstruct
    public void init() {
       System.out.println("Table created successfully");
   }


   //add doctors
    public  addDoctors(List<Doctors> doctors) {
       String sql="INSERT INTO doctors(doctor_id,name,contact,consultation_fee,speciality_id,is_active) VALUES(?,?,?,?,?,?)";

       return  jdbcTemplate.update(sql,new BeanPropertyRowMapper<>(Doctors.class));


    }



}
