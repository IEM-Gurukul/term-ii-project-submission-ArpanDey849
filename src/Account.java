package bank;

import user.Customer;
import exceptions.InsufficientFundsException;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private String cardNumber;
    private String pin;
    private Customer customer;
    private double balance;
    private List<String> transactionHistory;
    
    public Account(String cardNumber, String pin, Customer customer, double balance) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.customer = customer;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }
    
    public String getCardNumber() {
        return cardNumber;
    }
    
    public String getPin() {
        return pin;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public boolean verifyPin(String pin) {
        return this.pin.equals(pin);
    }
    
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Balance: $" + balance + ", Requested: $" + amount);
        }
        this.balance -= amount;
        addTransaction("Withdrew: $" + amount);
    }
    
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive!");
        }
        this.balance += amount;
        addTransaction("Deposited: $" + amount);
    }
    
    public void addTransaction(String transaction) {
        transactionHistory.add(transaction);
    }
    
    public List<String> getTransactionHistory() {
        return transactionHistory;
    }
}
