import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        String Number, Holder;
        double Balance, Amount;
        int userChoice = 3;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Number: ");
        Number = userInput.nextLine();
        System.out.print("Holder: ");
        Holder = userInput.nextLine();
        System.out.print("Balance: ");
        Balance = userInput.nextDouble();
        Account myAccount = new Account(Number, Holder, Balance);
        System.out.println("Account Number: " + myAccount.getNumber());
        System.out.println("Account Holder: " + myAccount.getHolder());
        System.out.println("Account Balance: " + myAccount.getBalance() + "$");
        System.out.println("0: Quit, 1: Deposit, 2: Withdraw");
        while (userChoice != 0) {
            System.out.print("Make a choice: ");
            userChoice = userInput.nextInt();
            if (userChoice == 1) {
                System.out.print("Deposit Amount: ");
                Amount = userInput.nextDouble();
                myAccount.Deposit(Amount);
                System.out.println("Balance After Deposited: " + myAccount.getBalance() + "$");
            }
            else if (userChoice == 2) {
                System.out.print("Withdraw Amount: ");
                Amount = userInput.nextDouble();
                myAccount.Withdraw(Amount);
                System.out.println("Balance After Withdrawn: " + myAccount.getBalance() + "$");
            }
            else {
                if (userChoice != 0) {
                    System.out.println("Try again");
                }
            }
        }
        userInput.close();
        System.out.println("Card is used: " + myAccount.getTime() + " time(s)");
    }

}

class Account {
    private String Number, Holder;
    private double Balance;
    private int time = 0;
    public Account(String number, String holder, double balance) {
        Number = number;
        Holder = holder;
        Balance = balance;
    }
    public String getNumber() {
        return Number;
    }
    public String getHolder() {
        return Holder;
    }
    public double getBalance() {
        return Balance;
    }
    public void Deposit(double amount) {
        Balance += amount;
        time++;
    }
    public void Withdraw(double amount) {
        Balance -= amount;
        time++;
    }
    public int getTime() {
        return time;
    }
}
