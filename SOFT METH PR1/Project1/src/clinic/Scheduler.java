package clinic;
import java.util.Scanner;

public class Scheduler {
    private MedicalRecord medicalRecord;
    private Appointment[] appointments;
    private int size;

    public Scheduler(){
        this.medicalRecord = medicalRecord;
        this.appointments = new Appointment[4];
        this.size = size;
    }

    // Run method to process command lines
    public void run() {
        System.out.println("Scheduler is running.");
        Scanner scanner = new Scanner(System.in);

        // Continuously process commands until "Q" is entered
        while (true) {
            String commandLine = scanner.nextLine().trim();  // Read input and trim extra spaces

            if (commandLine.equalsIgnoreCase("Q")) {
                System.out.println("Scheduler terminated");
                break;  // Exit the loop and terminate the program
            } else if (!commandLine.isEmpty()) {
                processCommand(commandLine);  // Handle non-empty command lines
            }
        }

        scanner.close();  // Close the scanner when done
    }

    private void processCommand(String commandLine) {
        // Split the command into parts (you can add more specific parsing logic)
        String[] commandParts = commandLine.split("\\s+");
        String command = commandParts[0];

        // Example command processing: Schedule an appointment (You can add more commands)
        switch (command.toUpperCase()) {
            case "S":
                scheduleAppointment(commandParts);  // Handle appointment scheduling
                break;
            case "P":
                printAppointments();  // Print all appointments
                break;
            default:
                System.out.println("Unknown command: " + command);
        }
    }
    private void scheduleAppointment(String[] parsedCommand){
        if (commandParts.length < 6) {
            System.out.println("Invalid command. Usage: S <PatientName> <Date> <Timeslot> <Provider>");
            return;
        }

        String patientFirstName = commandParts[1];
        String patientLastName = commandParts[2];// e.g., "JohnDoe"
        String dateStr = commandParts[3];      // e.g., "10/30/2024"
        String timeslotStr = commandParts[4];  // e.g., "SLOT1"
        String providerStr = commandParts[5];  // e.g., "PATEL"

        Date appointmentDate;
        try {
            String[] dateParts = dateStr.split("/");
            int month = Integer.parseInt(dateParts[0]);
            int day = Integer.parseInt(dateParts[1]);
            int year = Integer.parseInt(dateParts[2]);
            appointmentDate = new Date(year, month, day);  // Assuming you have a Date constructor like this
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use MM/DD/YYYY.");
            return;
        }

        // Parse timeslot (Assuming Timeslot is an enum and has values like SLOT1, SLOT2, etc.)
        Timeslot timeslot;
        try {
            timeslot = Timeslot.valueOf(timeslotStr);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid timeslot. Available timeslots: SLOT1, SLOT2, SLOT3...");
            return;
        }

        // Parse provider (Assuming Provider is an enum with names like PATEL, SMITH, etc.)
        Provider provider;
        try {
            provider = Provider.valueOf(providerStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid provider. Available providers: PATEL, SMITH, etc.");
            return;
        }

        // Step 3: Check if the provider is available
        if (!isAvailable(provider, appointmentDate, timeslot)) {
            System.out.println("Provider " + provider + " is not available on " + dateStr + " at " + timeslotStr);
            return;
        }

        // Step 4: Find or create the patient (assuming MedicalRecord manages patients)
        Patient patient = medicalRecord.findPatientByName(patientName);  // Assuming this method exists in MedicalRecord
        if (patient == null) {
            // If patient doesn't exist, create a new one (or handle as per your project requirements)
            System.out.println("Patient " + patientName + " not found. Adding new patient to records.");
            patient = new Patient(new Profile(patientName, new Date()));  // Adjust based on your Profile and Patient classes
            medicalRecord.addPatient(patient);
        }

        // Step 5: Create the appointment
        Appointment newAppointment = new Appointment(appointmentDate, timeslot, patient.getProfile(), provider);

        // Step 6: Add the appointment to the array of appointments (resize if necessary)
        if (size == appointments.length) {
            grow();  // Resize the appointments array if it's full
        }
        appointments[size] = newAppointment;
        size++;  // Increment the size of the appointments list

        // Step 7: Add a visit for the patient in the medical record
        medicalRecord.addVisit(patient, newAppointment);

        // Step 8: Confirmation message
        System.out.println("Appointment scheduled for " + patientName + " with " + provider + " on " + dateStr + " at " + timeslotStr);
    }


    // You would parse the strings and create the appropriate objects (Date, Timeslot, Provider, etc.)


}
