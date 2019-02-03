import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    public Scanner userInput = new Scanner(System.in);
    private ArrayList<String> cartContents = new ArrayList<>();
    public void addToCart() {
        String something = userInput.nextLine();
        cartContents.add(something);
    }
    public void removeFromCart() {
        String something = userInput.nextLine();
        cartContents.remove(something);
    }
    public void checkOut() {
        userInput.close();
        System.out.println(cartContents.toString());
    }

}

