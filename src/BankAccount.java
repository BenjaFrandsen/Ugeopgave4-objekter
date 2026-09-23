import java.util.ArrayList;

public class BankAccount {
    String owner;
    double balance;
    ArrayList<Transaction> transactions;

    BankAccount(String owner, double startBalance) {
        this.owner = owner;
        this.balance = startBalance;
        this.transactions = new ArrayList<>();
        transactions.add(new Transaction("deposit", startBalance));
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("deposit", amount));
            System.out.println("Deposited " + amount +" into account");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("withdrawal", amount));
            System.out.println("Withdrawed " + amount + " from account");
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        }
    }

    public void printTransactionHistory() {
        System.out.println(owner + "s bank account");
        for (Transaction transaction: transactions) {
            System.out.println(transaction);
        }
    }

    public double getBalance() {
        return balance;
    }
}
