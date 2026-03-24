package transactions;

import bank.Account;
import exceptions.InsufficientFundsException;

public class Withdrawal extends Transaction {
    private static final double DAILY_LIMIT = 500.0;
    
    public Withdrawal(Account account, double amount) {
        super(account, amount);
    }
    
    @Override
    public void execute() throws Exception {
        if (amount <= 0) {
            throw new Exception("Withdrawal amount must be positive!");
        }
        if (amount > DAILY_LIMIT) {
            throw new Exception("Daily withdrawal limit is $" + DAILY_LIMIT);
        }
        account.withdraw(amount);
        System.out.println("Withdrawal successful! Amount: $" + amount);
    }
}
