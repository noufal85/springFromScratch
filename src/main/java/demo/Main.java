package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Doctor doctor = new Doctor();
//        doctor.treatPatient();
//        Doctor doctor = (Doctor) context.getBean("doctor");
//        doctor.treatPatient();
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Nurse nurse = (Nurse) context.getBean("nurse");
        nurse.treatPatient();
        Doctor doctor =  context.getBean(Doctor.class);
        doctor.setSpecialization("Cardiologist-2");
        doctor.treatPatient();
        System.out.println(doctor);
        Doctor doctor2 = (Doctor) context.getBean("doctor");
        System.out.println(doctor2);

    }

}
