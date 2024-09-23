package clinic;

public class Appointment implements Comparable <Appointment> {
    private Date date;
    private Timeslot timeslot;
    private Profile patient;
    private Provider provider;


    public Appointment(Date date, Timeslot timeslot, Profile patient, Provider provider) {
        this.date = date;
        this.timeslot = timeslot;
        this.patient = patient;
        this.provider = provider;
    }

    @Override
    public int compareTo(Appointment b) {
        return 0;
    }

    public Profile getPatient() {
        return patient;
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public boolean equals(Object a) {
        if (this.date == b.date) {
            if (this.timeslot == b.timeslot) {
                if (this.patient == b.patient) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return date.toString() + " " + timeslot.toString() + " " + patient.toString() + " " + provider.toString();
    }
}



