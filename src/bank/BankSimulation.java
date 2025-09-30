package bank;

public class BankSimulation {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Alice", 1000, 5);
        savings.deposit(500);
        savings.withdraw(200);
        savings.addInterest();
        savings.printTransactionHistory();

        System.out.println("\n-------------------------------");

        CurrentAccount current = new CurrentAccount("Bob", 2000, 500);
        current.withdraw(2200);
        current.deposit(300);
        current.withdraw(1000);
        current.printTransactionHistory();
    }
}
