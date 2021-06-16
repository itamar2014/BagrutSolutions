package Bagrut2018.Chapter1.ThirdQuestion;

public class Time {

    protected int hour;
    protected int minute;

    public Time(int hour, int minute){

        this.hour  = hour < 0 ? 0: hour;
        this.hour  = hour <= 23 ? this.hour : 0;


        this.minute  = minute <= 59 ? minute : 0;
        this.minute  = minute < 0 ? 0 : this.minute;


    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
