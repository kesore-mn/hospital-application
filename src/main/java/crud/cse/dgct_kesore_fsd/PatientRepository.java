package crud.cse.dgct_kesore_fsd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class PatientRepository {
    List<Patient> mypatient = new ArrayList<>();
    public PatientRepository()
    {
        Patient patient = new Patient();
        patient.setPatientId(11);
        patient.setPatientName("kumar");
        patient.setPatientAge(44);
        patient.setPatientBmi(34.5);
        patient.setPatientHeight(177);
        patient.setPatientWeight(82);
        mypatient.add(patient);

        patient=new Patient();
        patient.setPatientId(12);
        patient.setPatientName("madhan");
        patient.setPatientAge(20);
        patient.setPatientBmi(45.5);
        patient.setPatientHeight(178);
        patient.setPatientWeight(70);
        mypatient.add(patient);

        patient=new Patient();
        patient.setPatientId(13);
        patient.setPatientName("eilaf");
        patient.setPatientAge(20);
        patient.setPatientBmi(50.5);
        patient.setPatientHeight(170);
        patient.setPatientWeight(60);
        mypatient.add(patient);

        patient=new Patient();
        patient.setPatientId(14);
        patient.setPatientName("mithu");
        patient.setPatientAge(19);
        patient.setPatientBmi(30.5);
        patient.setPatientHeight(180);
        patient.setPatientWeight(78);
        mypatient.add(patient);

    }

//operations
//register
public Patient save(Patient patient){
    double tempHeight = patient.getPatientHeight();
    double tempWeight = patient.getPatientWeight();
    tempHeight/=100;// cm to m
    patient.setPatientBmi(tempWeight/(tempHeight*tempHeight));
    mypatient.add(patient);
    return patient;
}
// view all patients
public List<Patient> findAll(){
    return mypatient;
}
public List<Patient> findAllByObese(){
    return mypatient.stream().filter(each->{
        return each.getPatientBmi()>31.0;
    }).toList();
}
}

