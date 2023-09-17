public class Doctor extends SalariedEmployee{
    private String specialty;
    private double fee;
    public Doctor(){
        this("No name", new Date(), 0.0, "No specialty", 0.0);
    }
    public Doctor(String name, Date date, double salary, String specialty, double fee){
        super(name, date, salary);
        setSpecialty(specialty);
        setFee(fee);
    }
    public Doctor(Doctor other){
        super(other);
        setSpecialty(other.specialty);
        setFee(other.fee);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        if(specialty == null){
            System.out.println("Please enter a specialty");
            System.exit(0);
        }
        this.specialty = specialty;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        if(fee < 0){
            System.out.println("Please enter a valid fee");
            System.exit(0);
        }
        this.fee = fee;
    }
    public String toString(){
        return "The Doctor " + super.toString() + "The Speciality is " + getSpecialty() + " and visit fee is $" + getFee();
    }
    public boolean equals(Doctor other){
        return (getName().equals(other.getName()) && getHireDate().equals(other.getHireDate())
        && getSalary() == other.getSalary() && getSpecialty().equals(other.getSpecialty()) && getFee() == other.getFee());
    }
}
