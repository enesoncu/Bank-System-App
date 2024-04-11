# Project Title: Bank System App

## Description
This Java application simulates a basic ATM system, allowing users to perform simple banking operations like viewing their balance, withdrawing cash (predefined amounts), and depositing funds. This project serves as an educational example to understand the core functionalities of a bank system.

## Features
- **Login System:** Users enter an account number and PIN (simulated) to access the system.
- **Menu-Driven Interface:** A clear menu offers options for viewing balance, withdrawing cash (predefined amounts), depositing funds, and exiting.
- **Balance Inquiry:** View the current account balance.
- **Withdrawal:** Withdraw cash in predefined amounts ($20, $40, $60, $100, or $200) based on available funds.
- **Deposit:** Deposit funds into the account.
- **Error Handling:** Handles invalid user input and insufficient funds for withdrawals.

## How to Use:

1- Prerequisites:
- Java Development Kit (JDK) installed on your system.
- A text editor or IDE for working with Java code.

2- Running the Application:
- Compile the Java source code (**BankSystemApp.java**) into a class file using a Java compiler.
- Run the application from the command line using **java BankSystemApp**.

3- User Interaction:
- Enter a valid account number and PIN (these are currently not implemented as secure login credentials).
- Select options from the menu using the corresponding numbers (1-4) and follow the prompts for withdrawal and deposit amounts.

## Future Enhancements
- Implement secure login mechanisms with encrypted credentials.
- Add features like transfer between accounts, transaction history, and account statements.
- Enhance error handling for invalid user input and potential exceptions.
- Consider a database or file system to store account information persistently.

## Contributing
Feel free to contribute to this project by:

- Implementing the missing **isValid** function for secure login with encrypted credentials.
- Adding features for account creation, transfer between accounts, and transaction history.
- Improving error handling and exception management.
- Exploring the use of a database or file system for persistent account information.

To contribute, fork the repository on GitHub and create a pull request with your proposed changes.
