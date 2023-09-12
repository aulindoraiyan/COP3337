import java.util.Date;

public class Employee {
    private String name;
    private double hireDate;

    public Employee(){
        this("No name yet", new Date());

    }
    public Employee(String name, double hireDate){
        setName(name);
        setHireDate(hireDate);
    }
    public Employee(Employee other){
        this(other.name, other.hireDate);
    }

    public void setName(String name){
        if(name == null){
            System.out.println("Enter valid name");
            System.exit(0);
        }
        this.name = name;
    }
    public void  setHireDate(double hireDate){
        if(hireDate == 0.0){
            System.out.println("Enter valid hire date.");
            System.exit(0);
        }
        this.hireDate = hireDate;
    }

    public String getName(){
        return name;
    }
    public Date getHireDate(){
        return hireDate;
    }

    public String toString(){
        return getName() + " was hired on " + getHireDate();
    }
    public boolean equals(Employee otherEmployee){
        return getName().equals(otherEmployee.getName()) && getHireDate().equals(otherEmployee.getHireDate());
    }
}
