public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(){
        this("No name", new Date(), 0.0);
    }
    public SalariedEmployee(String name, Date date, double salary){
        super(name, date);
        setSalary(salary);
    }
    public SalariedEmployee(SalariedEmployee other){
        super(other);
        setSalary(other.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0){
            System.out.println("Enter valid salary please. ");
            System.exit(0);
        }
        this.salary = salary;
    }
    public String toString(){
        return " at salary " + getSalary() + ". \n";
    }
}
