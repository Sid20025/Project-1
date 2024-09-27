package clinic;
import java.util.Calendar;

public class Date implements Comparable <Date>{
    private int date;
    private int month;
    private int year;
    public static final int QUADRENNIAL = 4;
    public static final int CENTENNIAL = 100;
    public static final int QUATERCENTENNIAl = 400;

    public Date (int date,int month, int year ){
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public int getDate(){
        return date;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public boolean isValid(int date, int month, int year){
        if(month < 1 || month > 12 || date < 1 || date > 31){
            return false;
        }
        if(date == 31){
            if(month == 2||month == 4||month == 6||month == 9||month == 11){
                return false;
            }
        }
        if(date == 30){
            if(month == 1||month == 2||month == 5||month == 7||month == 8|| month == 10|| month ==12)
                return false;
        }
        if(month == 2 && date == 29){
            if(year % QUADRENNIAL == 0){
                if(year % CENTENNIAL == 0){
                    if(year % QUATERCENTENNIAl == 0){
                        return true;
                    }
                }
            }
        }
        if(isPastDate()){
            return false;
        }
        return true;
    }
    private boolean isPastDate() {
        Calendar today = Calendar.getInstance(); // Get today's date

        // Get current year, month, and day
        int currentYear = today.get(Calendar.YEAR);
        int currentMonth = today.get(Calendar.MONTH) + 1; // Months are 0-based in Calendar, so we add 1
        int currentDay = today.get(Calendar.DAY_OF_MONTH);

        // Compare the year first
        if (year < currentYear) {
            return true; // The date is in a previous year
        } else if (year == currentYear) {
            // If the year is the same, compare the month
            if (month < currentMonth) {
                return true; // The date is in a previous month this year
            } else if (month == currentMonth) {
                // If the month is the same, compare the day
                return day < currentDay; // The date is earlier in the current month
            }
        }

        return false; // The date is today or in the future
    }
    @Override
    public int compareTo (Date b){
        if(this.year < b.year){
            return -1;
        }
        else{
            if(this.year>b.year){
                return 1;
            }
        }
        if (this.month < b.month) {
            return -1;
        }
        if(this.month>b.month){
            return 1;
        }
        if(this.date < b.date){
            return -1;
        }
        if(this.date>b.date){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return date + "/" + month + "/" + year;
    }


}
