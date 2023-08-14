abstract class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate=interestRate;
    }

    @Override
    public void deposit(double amount){
        if (amount > 0){
            double interest = amount *interestRate / 100;
            double totalAmount = amount + interest;
            super.balance += totalAmount;
            System.out.println(amount + " deposited. Interest earned: " + interest);
        }
    }
    @Override
    public void withdraw(double amount){
        if (amount >0 && amount<= super.balance){
            super.balance -= amount;
            System.out.println(amount + " withdrawn.");
        } else{
            System.out.println("Insufficient balance.");
        }
    }
}
public class bank_account{
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("123456", 1000.0, 2.5);
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Account balance: " + account.getBalance());
    }
}
