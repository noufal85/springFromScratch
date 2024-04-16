package demo;


import org.springframework.stereotype.Component;

@Component("nurse")
public class Nurse implements Staff{
    public void treatPatient() {
        System.out.println("Nurse is caring for the patient");
    }
}
