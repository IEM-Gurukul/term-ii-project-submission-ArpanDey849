package transactions;

import bank.Account;
import bank.Bank;
import exceptions.AccountNotFoundException;

public class Transfer extends Transaction {
    private Account recipientAccount;
    private Bank bank;
    
    public Transfer(Account account, String recipientCardNumber, double amount, Bank bank) throws AccountNotFoundException {
        super(account, amount);
        this.bank = bank;
        this.recipientAccount = bank.findAccount(recipientCardNumber);
        if (this.recipientAccount == null) {
            throw new AccountNotFoundException("Recipient account not found!");
        }
    }
    
    @Override
    public void execute() throws Exception {
        if (amount <= 0) {
            throw new Exception("Transfer amount must be positive!");
        }
        account.withdraw(amount);
        recipientAccount.deposit(amount);
        account.addTransaction("Transferred: $" + amount + " to " + recipientAccount.getCustomer().getName());
        recipientAccount.addTransaction("Received: $" + amount + " from " + account.getCustomer().getName());
        System.out.println("Transfer successful! Amount: $" + amount);
    }
    
    public Account getRecipientAccount() {
        return recipientAccount;
    }
}
