ATM Simulation System

Problem Statement
Modern banking requires secure, reliable, and user-friendly automated teller machines (ATMs) that allow customers to perform financial transactions independently. This simulation addresses the need for a robust ATM system that handles authentication, balance inquiries, cash withdrawals, deposits, and fund transfers while maintaining security and data integrity.

 Target User
- Bank Customers who need to perform basic banking transactions
- Banking Students learning about financial systems
- Developers studying OOP design patterns

Core Features
1. User Authentication: Secure login with card number and PIN
2. Balance Inquiry: Real-time account balance checking
3. Cash Withdrawal: Withdraw money with limits and validation
4. Cash Deposit: Deposit money into accounts
5. Fund Transfer: Transfer money between accounts
6. Transaction Receipts: Printable transaction records
7. Error Handling: Comprehensive exception management

OOP Concepts Used

1. Encapsulation
- Private fields with public getters/setters in Account, Customer classes
- Data hiding through access modifiers

2. Inheritance
- Transaction abstract class extended by Withdrawal, Deposit, Transfer
- User abstract class as base for potential admin/customer roles

3. Polymorphism
- Transaction reference holding different transaction types
- execute() method behaving differently per transaction type

4. Abstraction
- ATMOperations interface defining core ATM functionality
- Abstract classes providing base implementations

5. Design Patterns
- Strategy Pattern: Different transaction types as strategies
- Factory Pattern: Transaction object creation
- Singleton Pattern: Bank instance management

 Architecture Description
The system follows a layered architecture:
- Presentation Layer: ATM interface and user interaction
- Business Layer: Transaction processing and business logic
- Data Layer: Account and transaction management

 How to Run

Prerequisites
- Java JDK 11 or higher
- Any Java IDE (Eclipse, IntelliJ, VS Code)

Steps
1. Clone the repository
2. Navigate to the src directory
3. Compile: javac Main.java
4. Run: java Main

Sample Login
- Card: 1001, PIN: 1234 (Balance: $5000)
- Card: 1002, PIN: 5678 (Balance: $3000)
