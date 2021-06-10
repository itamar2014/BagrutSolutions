package Bagrut2020.firstExam.Chapter2.FithQuestion;

public class Competitor {

    int minutes;
    int seconds;
    String name;

    public Competitor(int minutes, int seconds, String name) {
        this.minutes = minutes;
        this.seconds = seconds;
        this.name = name;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBfr(Competitor x){

        int mTime = this.getMinutes() * 60 + this.getSeconds();
        int oTime = x.getMinutes() * 60 + x.getSeconds();

        return mTime > oTime;
    }

}
