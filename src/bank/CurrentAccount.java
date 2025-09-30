
	package bank;

	public class CurrentAccount extends Account {
	    private double overdraftLimit;

	    public CurrentAccount(String accountHolder, double initialBalance, double overdraftLimit) {
	        super(accountHolder, initialBalance);
	        this.overdraftLimit = overdraftLimit;
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= getBalance() + overdraftLimit) {
	            super.withdraw(amount);
	        } else {
	            System.out.println("Overdraft limit exceeded.");
	        }
	    }
	}



