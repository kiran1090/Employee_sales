public class Worker extends Employee
{

    public Worker(String name, double salary, int age) {
        super(name, salary, age);
    }
    private double getAnnualBonus()
{
    return super.salary * 0.5;
}
}
