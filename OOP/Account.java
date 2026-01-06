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
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

public class Account {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount(50000);

        account.deposit(20000);
        account.withdraw(25000);

        System.out.println("Current Balance: $" + account.getBalance());
    }
}