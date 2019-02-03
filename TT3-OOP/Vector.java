import java.util.Scanner;

public class Vector {
    public Scanner userInput = new Scanner(System.in);
    private int x;
    private int y;
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX() {
        System.out.print("Enter x: ");
        x = userInput.nextInt();
    }
    public void setY() {
        System.out.print("Enter y: ");
        y = userInput.nextInt();
    }
    public void closeInput() {
        userInput.close();
    }
    public void add(Vector other) {
        x += other.x;
        y += other.y;
    }
    public void subtract(Vector other) {
        x -= other.x;
        y -= other.y;
    }
    public void multiply(Vector other) {
        x *= other.x;
        y *= other.y;
    }

}
