public class Automobile {
    private static double fuel;
    private static double speed;
    private static String license;
    public void init(double f, double s, String l) {
        fuel = f;
        speed = s;
        license = l;
    }
    public void accelerate(double pedalPressure) {
        if (fuel > 0) {
            System.out.println("SPEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEED!");
            speed += pedalPressure;
            fuel -= 0.5;
        }
    }
    public void decelerate(double pedalPressure) {
        if (fuel > 0) {
            System.out.println("SPEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEED! but the car is slowing down");
            speed -= pedalPressure;
            fuel -= 0.25;
        }
    }
    public String getLicense() {
        return license;
    }
    public double getFuel() {
        return fuel;
    }
    public double getSpeed() {
        return speed;
    }
    public static void main(String args[]) {
        Automobile myCar = new Automobile();
        myCar.init(4.5,34,"29JAD");
        System.out.println("License: " + myCar.getLicense());
        while (myCar.getFuel() > 0) {
            myCar.accelerate(4);
            System.out.println("Speed: " + myCar.getSpeed());
            System.out.println("Fuel: " + myCar.getFuel());
            myCar.decelerate(5);
            System.out.println("Speed: " + myCar.getSpeed());
            System.out.println("Fuel: " + myCar.getFuel());
            if (myCar.getFuel() == 0) {
                System.out.println("Out of fuel");
            }
        }
    }

}