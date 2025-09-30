# 🏦 Bank Account Simulation (Java OOP)

## 📌 Objective
This project simulates basic **banking operations** such as deposit, withdrawal, interest calculation, and overdraft using **Java OOP concepts**.  
It is implemented in **Eclipse IDE** with a clean package structure.

---

## ⚙️ Tech Stack
- **Language**: Java  
- **IDE**: Eclipse  
- **Concepts Used**:  
  - Classes & Objects  
  - Inheritance  
  - Method Overriding  
  - Encapsulation  
  - Polymorphism  

---

## 📂 Project Structure
BankAccountSimulation/
└── src/
└── bank/
├── Account.java
├── SavingsAccount.java
├── CurrentAccount.java
└── BankSimulation.java

markdown
Copy code

- **Account.java** → Base class with deposit, withdraw, balance, and transaction history.  
- **SavingsAccount.java** → Inherits from `Account`, adds interest feature.  
- **CurrentAccount.java** → Inherits from `Account`, supports overdraft.  
- **BankSimulation.java** → Main class with `public static void main()` to test functionalities.  

---

## 🚀 Features
- Create **Bank Accounts** (Savings & Current).  
- **Deposit & Withdraw** money with validations.  
- **Interest calculation** for Savings Account.  
- **Overdraft support** for Current Account.  
- **Transaction History** tracking for each account.  

---

## 🖥️ How to Run (in Eclipse)
1. Open Eclipse → `File > New > Java Project` → Name: `BankAccountSimulation`.  
2. Create a package: `bank`.  
3. Add the 4 Java files:  
   - `Account.java`  
   - `SavingsAccount.java`  
   - `CurrentAccount.java`  
   - `BankSimulation.java`  
4. Right-click `BankSimulation.java` → **Run As > Java Application**.  
5. The output will appear in the Eclipse **Console**.

---

## 📊 Sample Output
Deposited: 500.0
Withdrew: 200.0
Interest added: 65.0

Transaction History for Alice:
Account created with balance: 1000.0
Deposited: 500.0
Withdrew: 200.0
Deposited: 65.0

Withdrew: 2200.0
Deposited: 300.0
Invalid withdrawal amount.

Transaction History for Bob:
Account created with balance: 2000.0
Withdrew: 2200.0
Deposited: 300.0