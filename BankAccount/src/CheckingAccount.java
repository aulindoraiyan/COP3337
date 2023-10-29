public class CheckingAccount implements BankAccount{
    private int accountNo;
    private String name;
    public double totalAmount;

    public CheckingAccount(int accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void deposit(double amount) {
          totalAmount += amount;
    }

    @Override
    public void withdraw(double amount) {
            totalAmount -= amount;
    }

    @Override
    public double getBalancce() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return
                "accountNo=" + accountNo +
                ", name='" + name + '\'';
    }
}
