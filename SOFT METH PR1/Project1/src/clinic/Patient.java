package clinic;


    public class Patient implements Comparable<Patient> {
        private Profile profile;
        private Visit visits; //a linked list of visits (completed appt.)
        public int charge() {
        return 0;
        }
        //traverse the linked list to compute the charge
        @Override
        public int compareTo(Patient q){
            if(this.profile == q.profile && this.visits == q.visits){
                return 0;
            }
            return -1;
        }


    }

