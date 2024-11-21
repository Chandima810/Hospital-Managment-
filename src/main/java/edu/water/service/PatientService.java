package edu.water.service;

import edu.water.dto.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getPatient();
    void addPatient(Patient patient);
}
