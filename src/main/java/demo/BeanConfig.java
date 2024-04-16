package demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("demo")
public class BeanConfig {
    @Bean
    @Scope("prototype")
    public Doctor doctor() {
        Doctor doctor = new Doctor();
        doctor.setName("Dr. John");
        doctor.setQualification("MBBS");
        doctor.setSpecialization("Cardiologist");
        return doctor;
    }
}
