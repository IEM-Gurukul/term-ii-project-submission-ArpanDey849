import atm.ATM;
import bank.Bank;
import bank.Account;
import user.Customer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a bank
        Bank bank = new Bank("National Bank");
        
        // Create sample accounts
        Customer customer1 = new Customer("John Doe", "john@email.com", "1234567890");
        Customer customer2 = new Customer("Jane Smith", "jane@email.com", "0987654321");
        
        bank.addAccount(new Account("1001", "1234", customer1, 5000.0));
        bank.addAccount(new Account("1002", "5678", customer2, 3000.0));
        
        // Create ATM
        ATM atm = new ATM(bank, 10000.0);
        
        System.out.println("=================================");
        System.out.println("    WELCOME TO ATM SIMULATION    ");
        
        
        // Start ATM
        atm.start();
        
        scanner.close();
    }
}