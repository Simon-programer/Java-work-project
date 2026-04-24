
class Account {
    private String name;
    private double balance;

    // Constructor
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Method 1: Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Method 2: Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Not enough balance!");
        }
    }

    // Method 3: Display Balance
    public void displayBalance() {
        System.out.println("Account Holder: " + name);
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Account acc = new Account("John", 1000);

        acc.displayBalance();
        acc.deposit(500);
        acc.withdraw(200);
        acc.displayBalance();
    }
}