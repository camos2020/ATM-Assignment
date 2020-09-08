
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class AtmClientApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Atm myAtm = new Atm(500, "2468");

        System.out.println("Welcome to WCCI Bank");
        System.out.println("Please enter your pin");
        String userEnteredPin = input.nextLine();

        while (myAtm.accessAccount(userEnteredPin) == false) {
            System.out.println("I'm sorry, that is an invalid pin, please try again!");
            userEnteredPin = input.nextLine();
        }

        System.out.println("Please Choose an option");
        System.out.println("Press 1 to check balance");
        System.out.println("Press 2 to deposit money");
        System.out.println("Press 3 to withdraw money");
        System.out.println("Press 4 to EXIT");
        String userChoice = input.nextLine();

        while (!userChoice.equals("4")) {
            if (userChoice.equals("1")) {
                System.out.println("Your current balance is : " + myAtm.getBalance());

            } else if (userChoice.equals("2")) {
                System.out.println("Please enter the deposit amount : ");
                int amountToDeposit = input.nextInt();
                myAtm.deposit(amountToDeposit);
                input.nextLine();

            } else if (userChoice.equals("3")) {
                System.out.println("Please enter the amount you wish to take out : ");
                int amountToWithdraw = input.nextInt();
                myAtm.deposit(amountToWithdraw);
                input.nextLine();

            } else {
                System.out.println("I'm sorry, that is an invalid response");
            }

            System.out.println("Please Choose an option");
            System.out.println("Press 1 to check balance");
            System.out.println("Press 2 to deposit money");
            System.out.println("Press 3 to withdraw money");
            System.out.println("Press 4 to EXIT");
            userChoice = input.nextLine();
        }

        System.out.println("Thank you for your business");
        input.close();
    }
}
