package edu.water.controller;

import edu.water.dto.Patient;
import edu.water.service.PatientService;
import edu.water.service.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PatientController {
    @Autowired
    PatientService service;

    @GetMapping("/get-all")
    public List<Patient> getPatient(){
        return service.getPatient();
    }

    @PostMapping("/add-patient")
    public void addPatient(@RequestBody Patient patient){

        service.addPatient(patient);
    }
}


