package clinic;

public class MedicalRecord {
    private Patient[] patients;
    private int size; //number of patient objects in the array

    public MedicalRecord(){
        this.patients = new Patient[0];
        this.size = 0;
    }
}
