package bank;

import exceptions.InvalidPinException;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<Account> accounts;
    
    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }
    
    public String getBankName() {
        return bankName;
    }
    
    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    public Account findAccount(String cardNumber) {
        for (Account account : accounts) {
            if (account.getCardNumber().equals(cardNumber)) {
                return account;
            }
        }
        return null;
    }
    
    public Account authenticateAccount(String cardNumber, String pin) throws InvalidPinException {
        Account account = findAccount(cardNumber);
        if (account == null) {
            throw new InvalidPinException("Card number not found!");
        }
        if (!account.verifyPin(pin)) {
            throw new InvalidPinException("Invalid PIN!");
        }
        return account;
    }
    
    public List<Account> getAllAccounts() {
        return accounts;
    }
}
