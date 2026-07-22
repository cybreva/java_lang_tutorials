package project4;

import java.util.Scanner;

class BankAccount {

    private double balance = 0;
    private String accountNumber = "021345233124123";
    private String pin = "0120";

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean checkPin(String pin) {
        return this.pin.equals(pin);
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " Deposited Successfully.");
        } else {
            System.out.println("Invalid Amount!");
        }

    }

    public boolean withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Amount!");
            return false;
        }

        if (amount > balance) {
            System.out.println("Insufficient Balance!");
            return false;
        }

        balance -= amount;
        System.out.println("₹" + amount + " Withdrawn Successfully.");
        return true;

    }

    public double getBalance() {
        return balance;
    }

}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount b1 = new BankAccount();

        System.out.println("===== WELCOME =====");

        while (true) {

            System.out.print("Enter Account Number : ");
            String accountNumber = sc.next();

            if (accountNumber.equals(b1.getAccountNumber())) {
                System.out.println("Account Found!");
                break;
            }

            System.out.println("Account Not Found!\n");

        }

        int attempts = 0;

        while (attempts < 3) {

            System.out.print("Enter PIN : ");
            String pin = sc.next();

            if (b1.checkPin(pin)) {
                System.out.println("Login Successful!\n");
                break;
            }

            attempts++;

            System.out.println("Wrong PIN!");

            if (attempts == 3) {
                System.out.println("Too Many Attempts.");
                sc.close();
                return;
            }

        }

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Amount : ");
                    double withdraw = sc.nextDouble();
                    b1.withdraw(withdraw);
                    break;

                case 2:

                    System.out.print("Amount : ");
                    double deposit = sc.nextDouble();
                    b1.deposit(deposit);
                    break;

                case 3:

                    System.out.println("Current Balance : ₹" + b1.getBalance());
                    break;

                case 4:

                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice!");

            }

        }

    }

}