package clinic;

public class Visit {

    private Appointment appointment; //a reference to an appointment object
    private Visit next; //a ref. to the next appointment object in the list

    public Visit(Appointment appointment, Visit next){
        this.appointment = appointment;
        this.next = next;
    }
}
