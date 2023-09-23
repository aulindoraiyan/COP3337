public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(){
        this("No name ", new Date(), 0.0);
    }
    public SalariedEmployee(String name, Date hireDate, double salary){
        super(name, hireDate);
        setSalary(salary);
    }
    public SalariedEmployee(SalariedEmployee other ){
        super(other);
        setSalary(other.salary);
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public String toString(){
        return super.toString() + " at Salary " + getSalary();
    }
    public boolean equals(SalariedEmployee other){
        return (getName().equals(other.getName()) && getHireDate().equals(getHireDate()) && getSalary() == other.getSalary());
    }

}
