package edu.water.service;
import edu.water.dto.Patient;
import edu.water.entity.PatientEntity;
import edu.water.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    final PatientRepository repository;
    final ModelMapper mapper;



    @Override
    public List<Patient> getPatient() {
        List<Patient> patientList= new ArrayList<>();
        repository.findAll().forEach(patient-> patientList.add(mapper.map(patient,Patient.class)));
        return patientList;

    }

    @Override
    public void addPatient(Patient patient) {
        ;
        repository.save(mapper.map(patient, PatientEntity.class));

    }
}

