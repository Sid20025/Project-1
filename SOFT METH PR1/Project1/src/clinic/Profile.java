package clinic;

public class Profile {
    private String fname;
    private String lname;
    private Date dob;

    public Profile(String fname, String lname, Date dob){
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
    }
    @Override
    public String toString(){
        return fname + " " + lname + " " + dob;
    }
    public String getFname(){
        return fname;
    }
    public String getLname(){
        return lname;
    }

}
