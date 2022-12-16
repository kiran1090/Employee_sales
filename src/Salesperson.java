public class Salesperson extends Employee {
private double commissionPercentage;
    public Salesperson(String name, double salary, int age, double commissionPercentage) {
        super(name, salary, age);
        this.commissionPercentage=commissionPercentage;
    }

    public double getCommissionPercentage() {
        return commissionPercentage;
    }

}
