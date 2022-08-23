public class BreakPoint {
    public static void main(String[] args) {
        int number = 5;
        long big = 440303030;
        double dec = 90.5;
        boolean yes = true;
        char let = 'f';
        String word = "word";

        System.out.println(start());
    }


    public static String start() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <=i ; j++) {
                if (i ==j ) {
                    System.out.println("*");
                } else {
                    System.out.println("   ");
                }
            }
        }
    }
}
