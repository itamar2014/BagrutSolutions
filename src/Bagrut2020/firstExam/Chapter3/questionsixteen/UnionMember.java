package Bagrut2020.firstExam.Chapter3.questionsixteen;

public class UnionMember extends Employee{
    private int inUnionYears;



    public UnionMember(int years, int inUnionYears) {
        super(years);
        this.inUnionYears = inUnionYears;
    }

    public int getInUnionYears() {
        return inUnionYears;
    }

    public void setInUnionYears(int inUnionYears) {
        this.inUnionYears = inUnionYears;
    }

    @Override
    public int GetScore() {
        int finalPoints;
        finalPoints = (super.GetScore() * 2) + (this.getInUnionYears() * 2);

        return finalPoints;
    }
}
