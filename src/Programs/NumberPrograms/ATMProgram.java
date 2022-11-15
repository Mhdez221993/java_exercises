package Programs.NumberPrograms;

import java.util.Scanner;

/*
In Java, we can create an ATM program for representing ATM transaction. In the ATM program,
the user has to select an option from the options displayed on the screen.
The options are related to withdraw the money, deposit the money, check the balance, and exit.

    To withdraw the money, we simply get the withdrawal amount from the user and remove that amount from the total balance and print the successful message.

    To deposit the money, we simply get the deposit amount from the user, add it to the total balance and print the successful message.

    To check balance, we simply print the total balance of the user.
 */
public class ATMProgram {
    public static void main(String[] args) {
        int balance = 10000, withDraw, deposit;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform: ");

            // get choice from user
            int choice = in.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Enter the money to be withdraw: ");
                    // get the withdrawl money from user
                    withDraw = in.nextInt();

                    // check whether the balance is greater than or equal to the withdrawal amount
                    if (balance >= withDraw) {
                        balance -= withDraw;
                        System.out.println("Please collect your money");
                    } else {
                        // show custom error message
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter money to be deposited: ");

                    // get deposited amount from user
                    deposit = in.nextInt();

                    // add the deposit to the total balance
                    balance += deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println();
                    break;

                case 3:
                    // display the total balance of the user
                    System.out.println("Balance: " + balance);
                    System.out.println();
                    break;

                case 4:
                    // exit program
                    System.exit(0);
            }
        }
    }
}


