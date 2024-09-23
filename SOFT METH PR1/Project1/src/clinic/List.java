package clinic;

public class List {

    private Appointment[] appointments;
    private int size; //number of appointments in the array
    public List(){
        this.appointments = new Appointment[4];
    }
    private int find(Appointment appointment){
        for (int i = 0; i< size; i++){
            if(appointments[i] == appointment){
                return i;
            }
        }
        return NUll;
    } //helper method
    private void grow(){
        Appointment[] newAppointments = new Appointment[size + 4];
        for(int i = 0; i<size; i++){
            newAppointments[i] = appointments[i];
        }
        appointments = newAppointments;
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
        if(appointments.length <= size){
            grow();
        }

        appointments[size] = appointment;
        size++;
    }
    public void remove(Appointment appointment){
       int index = find(appointment);
       appointments[index] = null;
       for(int i = index; i < size-1; i++){
           appointments[index] = appointments[index+1];
        }
       appointments[size] = null;
       size--;
    }
    public void printByPatient(){

    }//ordered by patient profile, date/timeslot
    public void printByLocation(){

    } //ordered by county, date/timeslot
    public void printByAppointment(){

    }//ordered by date/timeslot, provider name
}
