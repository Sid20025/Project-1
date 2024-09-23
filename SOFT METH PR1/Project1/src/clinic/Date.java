package clinic;

public class Date {
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
        return true;
    }
    public int compareTo (Date a, Date b){
        if(a.year < b.year){
            return -1;
        }
        else{
            if(a.year>b.year){
                return 1;
            }
        }
        if (a.month < b.month) {
            return -1;
        }
        if(a.month>b.month){
            return 1;
        }
        if(a.date < b.date){
            return -1;
        }
        if(a.date>b.date){
            return 1;
        }
        return 0;
    }
}
