public class Employee {
    protected String name;
    protected double salary;
    private int age;
    public Employee(String name,double salary,int age)
    {
        this.name=name;
        this.salary=salary;
        this.age=age;
    }
    public String getName()
    {
        return this.name;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public int getAge()
    {
        return this.age;
    }
    public void raiseSalary()
    {
        this.salary=this.salary + 2000;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
