import java.util.Scanner;

public class VectorTest {
    public static void main(String[] args) {
        double []x_array = new double[100];
        double []y_array = new double[100];
        double temp = 0, euclid;
        int n;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = userInput.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter x" + (i+1) + " coordinates: ");
            x_array[i] = userInput.nextDouble();
            System.out.print("Enter y" + (i+1) + " coordinates: ");
            y_array[i] = userInput.nextDouble();
        }
        userInput.close();
        for (int i = 0; i < n; i++) {
            System.out.println("x" + (i+1) + " : " + x_array[i] + " y" + (i+1) + " : " + y_array[i]);
            temp += (Math.pow(x_array[i] - y_array[i], 2));
        }
        euclid =  Math.sqrt(temp);
        System.out.println("Euclidean distance: " + String.format("%.2f", euclid));
    }

}



