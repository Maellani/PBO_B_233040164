package Pertemuan_14;

public class BankAccount {
    private final String accountNumber;  // tidak boleh berubah setelah diinisialisasi
    protected double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public final void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : $" + balance);
    }
}
