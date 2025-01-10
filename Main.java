class BankAccount {
    private String ownerName;
    private double balance;

    // Constructor
    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", 1000.0);
        account1.deposit(500.0);    // Adding money
        account1.withdraw(200.0);  // Deducting money
        account1.checkBalance();   // Checking balance
    }
}
