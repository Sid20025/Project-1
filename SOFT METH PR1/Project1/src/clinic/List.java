package clinic;

public class List {

    private Appointment[] appointments;
    private int size; //number of appointments in the array
    private int find(Appointment appointment){
        for (int i = 0; i< size; i++){
            if(appointments[i] == appointment){
                return i;
            }
        }
        return NUll;
    } //helper method
    private void grow(){

    } //helper method to increase the capacity by 4
    public boolean contains(Appointment appointment){
        for (int i = 0; i< size; i++){
            if(appointments[i] == appointment){
                return true;
            }
        }
        return false;
    }//check before add/remove
    public void add(Appointment appointment){
        appointments[size] = appointment;
        size++;
    }
    public void remove(Appointment appointment)
    public void printByPatient()//ordered by patient profile, date/timeslot
    public void printByLocation() //ordered by county, date/timeslot
    public void printByAppointment()//ordered by date/timeslot, provider name
}
