public class Doctor extends SalariedEmployee{
    private String specialty;
    private double fee;

    public Doctor(){
        this("No name yet", new Date(), 0.0, "No Specialty", 0.0);
    }
    public Doctor(String name, Date date, Double salary, String specialty, double fee){
        super(name, date, salary);
        setSpecialty(specialty);
        setFee(fee);
    }
    public Doctor(Doctor other){
        super(other);
        setSpecialty(specialty);
        setFee(fee);

    }
    public void setSpecialty(String specialty){
        if(specialty == null){
            System.out.println("Please enter a valid specialty");
            System.exit(0);
        }
        this.specialty = specialty;
    }
    public String getSpecialty(){
        return specialty;
    }
    public void setFee(double fee){
        if(fee <= 0.0){
            System.out.println("Please enter valid fee");
            System.exit(0);
        }
        this.fee = fee;
    }
    public double getFee(){
        return fee;
    }
    public String toString() {
        return super.toString() + "\n" + "The speciality is " + getSpecialty() + " and visit fee is " + getFee();
    }

    public boolean equals(Doctor other){
        return (getName().equals(other.getName()) && getHireDate().equals(getHireDate()) && getSalary() == other.getSalary()
        && getSpecialty().equals(getSpecialty()) && getFee() == getFee());
    }

}
