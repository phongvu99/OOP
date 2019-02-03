import java.util.Scanner;

public class MinMax {
    private int n;
    private double []this_array = new double[100];
    private Scanner userInput = new Scanner(System.in);
    private void that_array() {
        System.out.print("Enter the size of the array: ");
        n = userInput.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value of index " + i);
            this_array[i] = userInput.nextDouble();
            userInput.close();
        }
    }
    private double minValue() {
        double min = this_array[0];
        for (int i = 1; i < n; i++) {
            if (min > this_array[i]) {
                min = this_array[i];
            }
        }
        return min;
    }
    private double maxValue() {
        double max = this_array[0];
        for (int i = 1; i < n; i++) {
            if (max < this_array[i]) {
                max = this_array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        MinMax myArray = new MinMax();
        myArray.that_array();
        System.out.println("Min: " + myArray.minValue());
        System.out.println("Max: " + myArray.maxValue());
    }

}
