import java.util.*;

import static java.lang.System.exit;

public class ATM {
    static User user = new User();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int counter = 1;

        while(counter == 1) {
            System.out.println("Welcome "+user.getUserId());
            System.out.println("Enter the serial number of the service you want to use: " +
                    "\n1.CheckBalance\n2.Withdraw\n3.Deposit\n4.View Transaction History");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1 -> System.out.println("Account Balance: " + user.getBalance());
                case 2 -> withdrawalService();
                case 3 -> depositService();
                case 4 -> viewTransactionHistory();
                default -> System.out.println("Enter a valid choice.");
            }
            System.out.println("To continue enter 1.\n To exit enter 0");
            counter = sc.nextInt();
        }
    }

    public static void withdrawalService(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Withdraw amount:  ");
        int amount = sc.nextInt();
        System.out.println();

        if(amount > user.getBalance()) {
            System.out.println("Insufficient balance for withdrawal.");
        }
        else{
            System.out.println(amount+" withdrawn.");
            user.updateTransaction("Withdraw",amount);
            user.updateBalance("Withdraw",amount);
            System.out.println("Account Balance: "+user.getBalance());
        }
    }

    public static void depositService(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Deposit amount: ");
        int amount = sc.nextInt();
        System.out.println();

        user.updateBalance("Deposit", amount);
        user.updateTransaction("Deposit", amount);
        System.out.println("Account Balance: "+user.getBalance());
    }

    public static void viewTransactionHistory(){
        System.out.println("Service\t\t\t\t\tAmount");
        user.getTransactionHistory().forEach((key, value) -> System.out.println(key+"\t\t\t\t\t"+value));
    }
}
