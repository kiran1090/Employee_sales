public class Salesperson extends Employee {
private double commissionPercentage;
    public Salesperson(String name, double salary, int age) {
        super(name, salary, age);
        this.commissionPercentage=commissionPercentage;
    }

    public double getCommissionPercentage() {
        return commissionPercentage;
    }
    public void raiseCommission()
    {
        if (this.commissionPercentage < .30) {
            this.commissionPercentage=this.commissionPercentage * 1.2;
        }
    }

}
