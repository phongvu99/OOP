import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        double startMiles, endMiles;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Start Miles: ");
        startMiles = userInput.nextDouble();
        System.out.print("End Miles: ");
        endMiles = userInput.nextDouble();
        userInput.close();
        Car myCar = new Car(startMiles, endMiles);
        System.out.println("============================================================");
        System.out.println("Car 1 Data");
        System.out.println("Start Miles: " + myCar.getStartMiles());
        System.out.println("End Miles: " + myCar.getEndMiles());
        System.out.println("Gallons: " + myCar.getGallons());
        System.out.println("Miles per gallon: " + myCar.calculatesMilesPerGallon());
    }

}

class Car {
    private double startMiles, endMiles, gallons;
    public Car(double startMiles, double endMiles) { // Call a constructor inside another constructor
        this(startMiles, endMiles, 5);
    }
    public Car(double startMiles, double endMiles, double gallons) { // Constructor
        this.startMiles = startMiles;
        this.endMiles = endMiles;
        this.gallons = gallons;
    }
    public double getStartMiles() {
        return startMiles;
    }
    public double getEndMiles() {
        return endMiles;
    }
    public double getGallons() {
        return gallons;
    }
    public double calculatesMilesPerGallon() {
        return (endMiles - startMiles)/(gallons);
    }
}