class BankAcc {
    private final String accountNumber;
    private double balance;

    public BankAcc(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive....");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds otr invalid amount...");
        }
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}

public class EncapsulationExample {
    
    public static void main(String[] args) {
        BankAcc acc = new BankAcc("9590095974", 10000);
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(2500);
        System.out.println("Balance after deposit: " + acc.getBalance());
            
        acc.withdraw(1200);
        System.out.println("Balance after Withdrawal: " + acc.getBalance());

        acc.withdraw(20000);
    }
}
