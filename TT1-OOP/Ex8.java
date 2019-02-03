public class Ex8 {
    public static void main(String[] args) {
        String year = args[0]; int n = Integer.parseInt(year);
        if (n % 4 == 0) {
            if(n % 100 == 0) {
                if (n % 400 == 0) {
                    System.out.println(n + " is a leap year");
                    return;
                }
                else{
                    System.out.println(n + " is not leap year");
                }
            }
            System.out.println(n + " is a leap year");
        }
    }
}
