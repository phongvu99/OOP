public class Ex7 {
    public static void main(String[] args) {
        String m = args[0]; double a = Double.parseDouble(m);
        String i = args[1]; double b = Double.parseDouble(i);
        String t = args[2]; double c = Double.parseDouble(t);
        double discriminant = Math.pow(b, 2) - 4*a*c;
        System.out.println("Discriminant is: " + discriminant);
        if (discriminant < 0) {
            System.out.println("No solution!");
        }
        else if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2*a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2*a);
            System.out.println("The roots of the equation are: " + String.format("%.2f", x1) + " " + String.format("%.2f", x2));
        }
        else {
            double x1 = -b/(2*a);
            System.out.println("The root of the equation is: " + String.format("%.2f", x1));
        }
    }
}


