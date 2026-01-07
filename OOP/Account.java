interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class SavingsAccount implements BankAccount {

    private double balance;
    
    public SavingsAccount(double initialBalance) {
        balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Savings - Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            System.out.println("Savings - Withdrawn: $" + amount);
        } else {
            System.out.println("Savings - Insufficient balance");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

class CurrentAccount implements BankAccount {
    private double balance;
    private final double overdraftLimit = 100000;

    public CurrentAccount(double initialBalance) {
        balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Current - Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Current - Withdrawn: $" + amount);
        } else {
            System.out.println("Current - Overdraft limit exceeded");
        }
    }
    @Override
    public double getBalance() {
        return balance;
    }
}

public class Account {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(5000);
        BankAccount current = new CurrentAccount(50000);

        savings.deposit(1200);
        savings.withdraw(4000);

        System.out.println("Savings - Balance: $" + savings.getBalance());
        System.out.println();

        current.deposit(1800);
        current.withdraw(120000);

        System.out.println("Current - Balance: $" + current.getBalance());
    }
}