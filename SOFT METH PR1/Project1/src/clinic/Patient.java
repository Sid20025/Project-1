package clinic;


    public class Patient implements Comparable<Patient> {
        private Profile profile;
        private Visit visits; //a linked list of visits (completed appt.)
        public int charge() {

        } //traverse the linked list to compute the charge

        public int compareTo(Patient p, Patient q){
            if(p.profile == q.profile && p.visits == q.visits){
                return 0;
            }
            return -1;
        }
    }

