import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }
    public void addAccount(BankAccount newAccount){
        accounts.add(newAccount);
    }
    public void depositMoney(BankAccount s1, int amount){

        s1.deposit(amount);
        System.out.println("Thanks for depositing " + amount + "$");
    }
    public void withdrawMoney(BankAccount o1, int amount){
        o1.withdraw(amount);
        System.out.println("You withdrew "+ amount + "$");
    }
    public void displayBalance(BankAccount o1){
        System.out.println("Your current account is " + o1.getBalancce());
    }
    public ArrayList<BankAccount> getAccounts(){
        return accounts;
    }

}

