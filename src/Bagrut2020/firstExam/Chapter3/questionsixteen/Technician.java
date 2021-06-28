package Bagrut2020.firstExam.Chapter3.questionsixteen;

public class Technician extends Employee{
    private int computers;

    public Technician(int years, int computers) {
        super(years);
        this.computers = computers;
    }

    public int getComputers() {
        return computers;
    }

    public void setComputers(int computers) {
        this.computers = computers;
    }

    @Override
    public int GetScore() {
        return super.GetScore() + this.getComputers();
    }
}
