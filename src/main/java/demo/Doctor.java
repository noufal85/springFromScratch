package demo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@ToString

@Component("doctor")
@Scope("prototype")
public class Doctor implements Staff, BeanNameAware {
    private String qualification;
    private String name;
    private String specialization;
    public void treatPatient() {
        System.out.println("Doctor is treating patient");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification is='" + qualification + '\'' +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is called: " + name);
    }

//    public String getQualification() {
//        return qualification;
//    }

//    public void setQualification(String qualification) {
//        this.qualification = qualification;
//    }
//
//    public String getSpecialization() {
//        return specialization;
//    }
//
//    public void setSpecialization(String specialization) {
//        this.specialization = specialization;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
