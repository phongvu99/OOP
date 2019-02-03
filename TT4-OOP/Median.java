import java.util.Scanner;

public class Median {
    private int n;
    private double []this_array = new double[100];
    private Scanner userInput = new Scanner(System.in);
    private void that_array() {
        System.out.print("Enter the size of the array: ");
        n = userInput.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value of index " + i);
            this_array[i] = userInput.nextDouble();
        }
        userInput.close();
    }
    private double middle() {
        int mid = n/2;
        double median = this_array[mid];
        if (n % 2 != 0) {
            System.out.println("Odd size number");
        }
        else {
            System.out.println("Even size number");
            median = (median + this_array[mid-1])/2;
        }
        return median;
    }
    public static void main(String[] args) {
        Median myArray = new Median();
        myArray.that_array();
        System.out.println("Median: " + myArray.middle());
    }

}
