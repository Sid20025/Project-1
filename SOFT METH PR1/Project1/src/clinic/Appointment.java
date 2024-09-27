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
    public int compareTo(Appointment b) { // to be completed
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
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the same object
        if (obj == null || getClass() != obj.getClass()) return false; // Null check and type check

        Appointment b = (Appointment) obj; // Cast to Appointment

        return this.date.equals(b.date) && // Assuming date is an object; if it's primitive, use ==
                this.timeslot.equals(b.timeslot) && // Assuming timeslot is an object
                this.patient.equals(b.patient); // Assuming patient is an object
    }

    @Override
    public String toString() {
        return date.toString() + " " + timeslot.toString() + " " + patient.toString() + " " + provider.toString();
    }
}



