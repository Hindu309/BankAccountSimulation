
	package bank;

	import java.util.ArrayList;
	import java.util.List;

	public class Account {
	    private String accountHolder;
	    private double balance;
	    private List<String> transactions;

	    public Account(String accountHolder, double initialBalance) {
	        this.accountHolder = accountHolder;
	        this.balance = initialBalance;
	        this.transactions = new ArrayList<>();
	        transactions.add("Account created with balance: " + initialBalance);
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            transactions.add("Deposited: " + amount);
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            transactions.add("Withdrew: " + amount);
	            System.out.println("Withdrew: " + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void printTransactionHistory() {
	        System.out.println("\nTransaction History for " + accountHolder + ":");
	        for (String transaction : transactions) {
	            System.out.println(transaction);
	        }
	    }
	}



