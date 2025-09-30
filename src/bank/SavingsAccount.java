
	package bank;

	public class SavingsAccount extends Account {
	    private double interestRate;

	    public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
	        super(accountHolder, initialBalance);
	        this.interestRate = interestRate;
	    }

	    public void addInterest() {
	        double interest = getBalance() * interestRate / 100;
	        deposit(interest);
	        System.out.println("Interest added: " + interest);
	    }
	}



