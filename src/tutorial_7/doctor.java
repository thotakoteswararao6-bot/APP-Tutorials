package tutorial_7;

package doctor;
public class doctor {
    private int doctorid;
    private String name;
    private String specialization;
    private double consultation fee;
    public Doctor(int doctorid,String name,String specialization, double consultationfee) {
        this.doctorid =doctorid;
        this.name=name;
        this.specialization = specialization;
        this.consultationfee = consultationfee;
    }
    public String getSpecialization() {
        return specialization;
    }
    public double getConsultationfee() {
        return consultationfee;
    }
    public String getName() {
        return name;
    }
    public void displayDoctor() {
        System.out.println("Doctor ID:" + doctorid);
        System.out.println("Name:"+ name);
        System.out.println("Specialization:"+specialization);
        System.out.println("Fee:"+consultationFee);
    }
}
package patient;
public class Patient {
    private int patientid;
    private String name;
    private String disease;
    private int age;
    public Patient(int patientid, String name, String disease, int age) {
        this.patientid = patientid;
        this.name=name;
        this.disease=disease;
        this.age = age;
    }
    public void displaypatient() {
        System.out.println("Patient ID:"+patientId);
        System.out.println("Name:"+name);
        System.out.println("Disease:"+disease);
        System.out.println("Age:"+age);
    }
}
import doctor.Doctor;
import patient.Patient;
public class Main {
    public static void main(String[] args) {
        Doctor d1 = new Doctor(1,"Arun","Cardiology",500);
        Doctor d2 = new Doctor(2,"Meena","Neurology",700);
        Patient p1 = new Patient(101,"Ravi","Heart Problem",45);
        Patient p2 = new Patient(102, "Kiran","Brain Tumor",52);
        Patient p3 = new Patient(103,"Suresh","Heart Pain",39);
        int doctor1Patients = 0;
        int doctor2Patients = 0;
        System.out.println("Patient 1");
        p1.displayPatient();
        System.out.println("Doctor assigned");
        d1.displayDoctor();
        doctor1Patients++;
        System.out.println();
        System.out.println("Patient 2");
        p2.displayPatient();
        System.out.println("Doctor assigned");
        d2.displayDoctor();
        doctor2Patients++;
        System.out.println();
        System.out.println("Patient 3");
        p3.displayPatient();
        System.out.println("Doctor assigned");
        d1.displayDoctor();
        doctor1Patients++;
        System.out.println();
        System.out.println("Total Fee Collected");
        System.out.println(d1.getName() + " : " +
                (doctor1Patients * d1.getConsultationFee()));
        System.out.println(d2.getName() + " : " +(doctor2Patients * d2.getConsultationFee()));
    }
}
