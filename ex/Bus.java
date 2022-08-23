package ex;

import com.sun.security.auth.module.NTSystem;
import com.sun.source.util.DocTreePathScanner;
import java.util.Scanner;
import java.util.Locale;

public class Bus {
    static Scanner scaner = new Scanner(System.in);
    static int lolo = 2;
    public static void main(String[] args) {
        String sentence = "nember: ";
        System.out.println(sentence);
        long passengers = 5000000000000L;
        int p = 7;
        System.out.println(passengers);
        passengers +=  9;
        System.out.println(passengers);
        passengers -= 6;
        System.out.println(passengers);
        passengers -= 3;
        System.out.println(sentence + passengers);
        char gender = 'f';
        System.out.println("gender "+ gender);
        double dicimale = 0.6;
        System.out.println("double "+ (dicimale+p));
        int counter = 0;
        counter++;
        System.out.println(counter);
        counter--;
        System.out.println(counter);
        int testinit = (int)dicimale;
        System.out.println(testinit);
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("welcome ");
        scan.nextInt();
        boolean boo1 = true;
        boolean bool2 = false;
        System.out.println(counter > passengers);
        test(lolo);
        String[] king = {"loo", "test"};
        System.out.println(king);
        /**
         * fuction
         */
    }

    /**
     *
      * @param lolo
     */
    /**
     *
     * @param lolo
     */
    /**
     *
     * @param lolo
     */
    /**
     *
     * @param lolo
     * @return
     */
    public static int test(int lolo) {
        return lolo +2;
    };

    public static void whileloop() {
        double guess = 0.2;
        while( Math.random() > guess) {
          System.out.print("lolo");
        }
    }

    public static int[] drw() {
        double test = Math.random() * 13;
         int n[] = {(int) test};
         n.toString();
         return n;
    }
}
