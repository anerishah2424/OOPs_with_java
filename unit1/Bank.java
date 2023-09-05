public class Main {

    int accountNumber;       // Unique account ID
    double balance;          // Current account balance
    String accountHolderName; // Name of the account holder
    private static int totalAccounts = 0; // Static variable to track total accounts created

    // Constructor to create a new BankAccount instance
    public BankAccount(int accountNumber, double initialBalance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.accountHolderName = accountHolderName;
        totalAccounts++; // Increment totalAccounts when a new account is created
    }

    // Instance method to print account details
    public void printAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    // Instance method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Instance method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    // Static method to return the total number of accounts created
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {
        // Create two BankAccount instances
        BankAccount account1 = new BankAccount(1001, 1000, "John Doe");
        BankAccount account2 = new BankAccount(1002, 1500, "Jane Smith");

        // Demonstrate account operations
        account1.printAccountDetails();
        account1.deposit(200);
        account1.withdraw(100);
        account1.printAccountDetails();

        account2.printAccountDetails();
        account2.deposit(500);
        account2.withdraw(200);
        account2.printAccountDetails();

        // Print total number of accounts created
        System.out.println("Total accounts created: " + BankAccount.getTotalAccounts());
    }
}