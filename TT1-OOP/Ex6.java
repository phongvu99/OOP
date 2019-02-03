public class Ex6 {
    public static void main(String[] args) {
        String n = args[0]; double a = Double.parseDouble(n);
        String y = args[1]; double b = Double.parseDouble(y);
        double x = -b/a;
        System.out.println("The root of the linear equation: " + String.format("%.2f", x));
    }
}
