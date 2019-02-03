import java.text.DecimalFormat;
import java.util.Scanner;

public class ShapeTestDrive2 {
    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat(".##");
        double x, y, r, h;
        int n;
        Scanner userInput = new Scanner(System.in);
        Point_Interface[] this_array = new Point_Interface[100];
        Circle_Interface[] that_array = new Circle_Interface[100];
        Cylinder_Interface[] these_array = new Cylinder_Interface[100];
        System.out.print("Enter number of objects: ");
        n = userInput.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for object No." + (i + 1));
            System.out.println("Enter x and y:");
            x = userInput.nextDouble();
            y = userInput.nextDouble();
            this_array[i] = new Point_Interface(x, y);
            System.out.print("Enter r: ");
            r = userInput.nextDouble();
            that_array[i] = new Circle_Interface(x, y, r);
            System.out.print("Enter h: ");
            h = userInput.nextDouble();
            these_array[i] = new Cylinder_Interface(x, y, r, h);
        }
        userInput.close();
        for (int i = 0; i < n; i++) {
            System.out.println("--------------------------");
            System.out.println("Object No." + (i + 1));
            System.out.println("Accessing point array");
            System.out.println("--------------------------");
            System.out.println("Name: " + this_array[i].getName());
            System.out.println("Accessing circle array");
            System.out.println("--------------------------");
            System.out.println("Name: " + that_array[i].getName());
            System.out.println("Area: " + df2.format(that_array[i].calArea()));
            System.out.println("Volume: " + that_array[i].calVolume());
            System.out.println("Accessing cylinder array");
            System.out.println("--------------------------");
            System.out.println("Name: " + these_array[i].getName());
            System.out.println("Area: " + df2.format(these_array[i].calArea()));
            System.out.println("Volume: " + df2.format(these_array[i].calVolume()));

        }
    }

}
