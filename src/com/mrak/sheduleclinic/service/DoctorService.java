package com.mrak.sheduleclinic.service;

import com.mrak.sheduleclinic.model.Doctor;

import java.util.List;

public interface DoctorService {
    public List<Doctor> listDoctors();
    public Doctor getDoctorById(int id);
    public void addDoctor(Doctor doctor);
    public void removeDoctor(Doctor doctor);
}
