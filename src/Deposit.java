package transactions;

import bank.Account;

public class Deposit extends Transaction {
    
    public Deposit(Account account, double amount) {
        super(account, amount);
    }
    
    @Override
    public void execute() throws Exception {
        if (amount <= 0) {
            throw new Exception("Deposit amount must be positive!");
        }
        account.deposit(amount);
        System.out.println("Deposit successful! Amount: $" + amount);
    }
}
