package clinic;

public class Appointment implements Comparable <Appointment> {
    private Date date;
    private Timeslot timeslot;
    private Profile patient;
    private Provider provider;


    public Appointment (Date date, Timeslot timeslot, Profile patient, Provider provider){
        this.date = date;
        this.timeslot = timeslot;
        this.patient = patient;
        this.provider = provider;
    }
    @Override
    public int compareTo(Appointment a, Appointment b){
        if()
    }
    public Profile getPatient(Appointment a){
        return a.patient;
    }
    public Timeslot getTimeslot(Appointment a){
        return a.timeslot;
    }
    public Date getDate(Appointment a){
        return a.date;
    }
    @Override
    public boolean equals( Appointment a, Appointment b){
        if(a.date == b.date){
            if(a.timeslot == b.timeslot){
                if(a.patient ==b.patient){
                    return true
                }
            }
        }
        return false;
    }
}
