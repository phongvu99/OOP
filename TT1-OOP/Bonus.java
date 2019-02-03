import java.util.Scanner;

public class Bonus {
    private static int b = 10;
    public static void main(String[] args) {
        System.out.println(Bonus.b);
        Scanner userInput = new Scanner(System.in);
        System.out.println("Where are you learning Java?");
        String country = userInput.nextLine();
        System.out.println("How old are you?");
        int age = userInput.nextInt();
        userInput.close();
        System.out.println("I am learning from " + country);
        System.out.println("I'm " + age + " years old");
        Bonus bonus = new Bonus();
        bonus.Greeting();
    }
    private void Greeting() {
        System.out.println("Hello!");
    }
}


