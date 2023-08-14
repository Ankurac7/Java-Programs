package Classroom;

class Account{
    protected double interestRate;
    protected String accountNumber;
    protected String customerName;
    protected double balance;

    public Account(double interestRate, String accountNumber, String customerName){
        this.interestRate = interestRate;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = 0.0;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else{
            System.out.println("Insufficient balance");
        }
    }

    public void viewBalance(){
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account{
    private String accountType; //Single, Joint

    public SavingsAccount(double interestRate, String accountNumber, String customerName, String accountType){
        super(interestRate, accountNumber, customerName);
        this.accountType = accountType;
    }

    public void closeAccount(){
        balance = 0;
        System.out.println("Account closed");
    }
}

class RecurringAccount extends Account{
    private int tenure;

    public RecurringAccount(double interestRate, String accountNumber, String customerName, int tenure){
        super(interestRate, accountNumber, customerName);
        this.tenure = tenure;
    }

    public void closeAccount(){
        System.out.println("Account closed");
    }
}

public class GCAssignment1{
    public static void main(String[] args){
        SavingsAccount savingsAcc = new SavingsAccount(0.05, "IND6284", "Prof. Subhajit Adhikari", "Single");
        RecurringAccount recurringAcc = new RecurringAccount(0.06, "IND3523", "Ankur Chanda", 12);

        savingsAcc.deposit(1000);
        savingsAcc.viewBalance();
        savingsAcc.withdraw(200);
        savingsAcc.viewBalance();
        savingsAcc.closeAccount();

        System.out.println("---------------");

        recurringAcc.deposit(500);
        recurringAcc.viewBalance();
        recurringAcc.withdraw(50);
        recurringAcc.viewBalance();
        recurringAcc.closeAccount();
    }
}
