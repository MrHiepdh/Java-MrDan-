package Week9;

public class Date2 {
    private int Day;
    private int Month;
    private int Year;

    public Date2(int day, int month, int year) {
        this.Day = day;
        this.Month = month;
        this.Year =year;
    }

    public int getDay() {
        return Day;
    }

    public int getMonth() {
        return Month;
    }

    public int getYear() {
        return Year;
    }

    public void setDay(int day) {
        this.Day = day;
    }

    public void setMonth(int month) {
        this.Month = month;
    }

    public void setYear(int year) {
        this.Year = year;
    }

    public void setDate(int day,int month,int year){
        this.Day = day;
        this.Month = month;
        this.Year = year;
    }

    public String toString(){
        return "Date : "+getDay()+"/"+getMonth()+"/"+getYear();
    }
}

class run3{
    public static void main(String [] args){
        Date2 dat = new Date2(1,2,2003);
        dat.setDay(5);
        System.out.println(dat);
    }
}


