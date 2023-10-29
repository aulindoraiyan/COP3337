public class SavingsAccount implements BankAccount{

    private int accountNumber;
    private String name;
    private double interestRate;
    private double totalamount = 0;

    public SavingsAccount(int accountNumber, String name, double interestRate) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.interestRate = interestRate;
    }
    public SavingsAccount(){
        this(0, "No name", 0.0);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        totalamount += amount;


    }

    @Override
    public void withdraw(double amount) {
        if(amount > getBalancce()){
            System.out.println("You dont have enough money");
        }
        else{
            totalamount -= amount;
        }
    }

    @Override
    public double getBalancce() {
        return totalamount;
    }

    @Override
    public String toString() {
        return
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", interestRate=" + interestRate +
                ", totalamount=" + totalamount ;

    }
}
