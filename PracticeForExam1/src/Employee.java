public class Employee extends Person{
    private Date hireDate;

    public Employee(){
        this("No name", new Date());
    }
    public Employee(String name, Date hireDate){
        super(name);
        setHireDate(hireDate);
    }
    public Employee(Employee other){
        super(other);
        setHireDate(other.hireDate);

    }
    public void setHireDate(Date hireDate){
        if (hireDate == null){
            System.out.println("Please enter valid hire date.");
            System.exit(0);
        }
        this.hireDate = hireDate;
    }
    public Date getHireDate(){
        return hireDate;
    }
    public String toString(){
        return super.toString() + "was hired on " + getHireDate() + ". ";
    }
    public boolean equals(Employee other){
        return (getName().equals(other.getName()) && getHireDate().equals(getHireDate()));
    }
}
