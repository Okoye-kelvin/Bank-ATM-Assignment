

import java.util.Scanner;

public class Account {

    static double Amount;

    static Scanner input = new Scanner(System.in);
    public static void withdrawal() {
        System.out.println("\n....Withdraw....");

        System.out.println("\nEnter Amount");
        Amount = input.nextDouble();

        if
        (Amount > Account_Balance.getAccountBalance()) {
            System.out.println("Insufficient funds");
        }
        else if
        (Amount <= Account_Balance.getAccountBalance()) {

            System.out.println("Transaction Successfull");
            System.out.println("New Balance =" + Account_Balance.getAccountBalance());
        }
    }


    public static void Deposit() {
        System.out.println("\n....Deposit....");

        System.out.println("Account Balance =" + Account_Balance.getAccountBalance());

        System.out.println("\nEnter Amount");
        Amount = input.nextDouble();
        double Deposit = Account_Balance.getAccountBalance() + Amount;
        System.out.println("Transaction Successful");
        System.out.println("Avail Balance =" + Deposit);


    }

    public static void main(String[] args) {
        withdrawal();
        Deposit();

    }


}


