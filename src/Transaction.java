package transactions;

import bank.Account;

public abstract class Transaction {
    protected Account account;
    protected double amount;
    protected String timestamp;
    
    public Transaction(Account account, double amount) {
        this.account = account;
        this.amount = amount;
        this.timestamp = java.time.LocalDateTime.now().toString();
    }
    
    public abstract void execute() throws Exception;
    
    public Account getAccount() {
        return account;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public String getTimestamp() {
        return timestamp;
    }
}
