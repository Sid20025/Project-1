package clinic;

public class MedicalRecord {
    private Patient[] patients;
    private int size; //number of patient objects in the array

    public MedicalRecord(){
        this.patients = new Patient[4];
        this.size = 0;
    }
    public void add(Patient p){
        if(patients.length == size){
            grow();
        }
       patients[size] = p;
       size++;
    }
    public void grow(){

            Patient[] newPatients = new Patient[size + 4];
            for(int i = 0; i < size; i++){
                patients[i] = newPatients[i];
            }


        patients = newPatients;
    }
    public Patient findPatientByName(String patientName){
        for(int i = 0; i < size; i++){
r       patients[i] = patients[i].get
        }
    }

}
