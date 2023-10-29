import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       SavingsAccount s1 = new SavingsAccount(1000, "Raiyan", 5.3);
       CheckingAccount c1 = new CheckingAccount(1001, "Oli");

       Bank b1 = new Bank();
        System.out.println(s1);
       b1.addAccount(s1);

       b1.depositMoney(s1, 5000);
       b1.withdrawMoney(s1, 1000);
       b1.displayBalance(s1);

       b1.addAccount(c1);
       b1.depositMoney(c1, 500);
       b1.withdrawMoney(c1, 2000);
       b1.displayBalance(c1);


    }
    public void displayBankAccounts(Bank b1){
        System.out.println("Total amount of accounts in the bank: " + b1.getAccounts());
    }
}