public class VectorTestDrive {
    public static void main(String[] args) {
        Vector a = new Vector();
        Vector b = new Vector();
        System.out.println("Enter coordinates for a");
        a.setX(); a.setY();
        System.out.println("Enter coordinates for b");
        b.setX(); b.setY();
        a.closeInput(); b.closeInput();
        System.out.print("a " + a.getX() + " " + a.getY());
        System.out.println(" || b " + b.getX() + " " + b.getY());
        a.add(b);
        System.out.println("a+b " + a.getX() + " " + a.getY());
        System.out.print("a " + a.getX() + " " + a.getY());
        System.out.println(" || b " + b.getX() + " " + b.getY());
        a.subtract(b);
        System.out.println("a-b " + a.getX() + " " + a.getY());
        System.out.print("a " + a.getX() + " " + a.getY());
        System.out.println(" || b " + b.getX() + " " + b.getY());
        a.multiply(b);
        System.out.println("a*b " + a.getX() + " " + a.getY());
    }

}
