
import java.util.ArrayList;

public class Account {

    private String accountHolder;
    private int accountId;
    private double balance;
    private ArrayList<String> transactionHistory = new ArrayList<>();

    public Account(String accountHolder, int accountId) {
        this.accountHolder = accountHolder;
        this.accountId = accountId;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        transactionHistory.add("Deposited: ₹" + amount);
        System.out.println("₹" + amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
            return;
        }
        balance -= amount;
        transactionHistory.add("Withdrew: ₹" + amount);
        System.out.println("₹" + amount + " withdrawn successfully.");
    }

    public void viewBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void viewTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }
        System.out.println("--- Transaction History ---");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountId() {
        return accountId;
    }
}
