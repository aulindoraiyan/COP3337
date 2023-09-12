public class HourlyEmployee extends Employee{
    private double wageRate;
    private double hours;

    public HourlyEmployee(){
        super();
        wageRate = 0.0;
        hours = 0.0;

    }
    public HourlyEmployee(String name, Date hireDate, double wageRate, double hours){
        super(name, hireDate);
        setWageRate(wageRate);
        setHours(hours);
    }
    public HourlyEmployee(HourlyEmployee other){
        super(other);
        setWageRate(other.wageRate);
        setHireDate(other.hours);
    }
    public void setWageRate(double wageRate){
        this.wageRate = wageRate;
    }
    public void setHours(double hours ){
        this.hours = hours;
    }
    public double getWageRate(){
        return wageRate;
    }
    public double getHours(){
        return hours;
    }
    public String toString(){
        return super.toString() + " and he has an hourly rate of " + getWageRate() + " and he " +
                "works for " + getHours() + " hours.";

    }
    public boolean equals(HourlyEmployee other){
        return super.equals(other) && getWageRate() == other.getWageRate() && getHours() == other.getHours();
    }
}
