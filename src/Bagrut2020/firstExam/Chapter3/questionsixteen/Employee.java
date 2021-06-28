package Bagrut2020.firstExam.Chapter3.questionsixteen;

public class Employee {
    private int years;

    public Employee(int years) {
        this.years = years;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int GetScore(){

        int finalPoints;
        finalPoints = this.getYears() +4;

        return finalPoints;
    }
}
