package Pertemuan_14;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    public void displaySavingsAccountInfo() {
        System.out.println("== Savings Account Info ==");
        // Panggil method final dari superclass
        super.displayAccountInfo();
        System.out.println("Interest Rate : 2.5%"); // misalnya tambahan info
    }
}

