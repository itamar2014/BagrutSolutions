package Bagrut2020.firstExam.Chapter3.questionsixteen;

public class Supervisor extends Employee {
    private Employee[] employees;

    public Supervisor(int years, Employee[] employees){
        super(years);
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public int GetScore() {
        int finalPoints;
        finalPoints = super.GetScore();
        for (Employee employee: employees){

            finalPoints+= employee.GetScore();

        }
        return finalPoints;
    }
}
