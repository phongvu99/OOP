public class Ex5 {
    public static void main(String[] args) {
        for (int i = 9; i > 0; i--) {
            if (i == 1) {
                System.out.println(i + " bottle of beer we are going to drink, " + i + " bottle of beer.");
                System.out.println("Now try to drink one, drink one,");
                System.out.println("Oh no, no bottles of beer to drink now.");
            }
            else {
                System.out.println(i + " bottles of beer we are going to drink, " + i + " bottles of beer.");
                System.out.println("Now try to drink one, drink one,");
            }
        }
    }
}
