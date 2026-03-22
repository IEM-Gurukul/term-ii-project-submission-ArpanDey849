package atm;

public interface ATMOperations {
    void withdraw(double amount) throws Exception;
    void deposit(double amount) throws Exception;
    void checkBalance();
    void transfer(String recipientCard, double amount) throws Exception;
    void viewTransactionHistory();
    void logout();
}
