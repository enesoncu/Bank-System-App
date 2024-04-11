import java.util.Scanner;

public class BankSystemApp {
    private static int balance = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int accountNumber;
        int pin;
        int choice;
        int withdrawalAmount;
        int depositAmount;

        while (true) {
            System.out.println("Welcome!\n");

            while (true) {
                System.out.print("Please enter your account number (5 digits): ");
                accountNumber = scanner.nextInt();
                System.out.print("Please enter your PIN (5 digits): ");
                pin = scanner.nextInt();

                if (isValid(accountNumber, pin)) {
                    break;
                } else {
                    System.out.println("Invalid account number or PIN. Please try again.");
                }
            }

            while (true) {
                System.out.println("\nMain Menu:");
                System.out.println("1. View my balance");
                System.out.println("2. Withdrawal");
                System.out.println("3. Deposit funds");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your account balance is: $" + balance);
                        break;
                    case 2:
                        while (true) {
                            System.out.println("\nWithdrawal Menu:");
                            System.out.println("1. $20");
                            System.out.println("2. $40");
                            System.out.println("3. $60");
                            System.out.println("4. $100");
                            System.out.println("5. $200");
                            System.out.println("6. Cancel Transaction");
                            System.out.print("Enter your choice: ");
                            withdrawalAmount = scanner.nextInt();

                            switch (withdrawalAmount) {
                                case 1:
                                    withdraw(20);
                                    break;
                                case 2:
                                    withdraw(40);
                                    break;
                                case 3:
                                    withdraw(60);
                                    break;
                                case 4:
                                    withdraw(100);
                                    break;
                                case 5:
                                    withdraw(200);
                                    break;
                                case 6:
                                    System.out.println("Transaction canceled.");
                                    break;
                                default:
                                    System.out.println("Invalid option. Please try again.");
                                    continue;
                            }
                            break;
                        }
                        break;
                    case 3:
                        System.out.print("Enter deposit amount or 0 to cancel: ");
                        depositAmount = scanner.nextInt();
                        if (depositAmount == 0) {
                            System.out.println("Transaction canceled.");
                        } else {
                            deposit(depositAmount);
                            System.out.println("Deposit of $" + depositAmount + " successful.");
                        }
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM. Wishing you a great day!\n");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }

                if (choice == 4) {
                    break;
                }
            }
        }
    }

    private static boolean isValid(int accountNumber, int pin) {
        return true;
    }

    private static void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Dispensing $" + amount + "...");
        } else {
            System.out.println("Insufficient funds. Please choose a smaller amount.");
        }
    }

    private static void deposit(int amount) {
        balance += amount;
    }
}
