import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] parts = {"tires", "keys"};
        Car nissan = new Car("nissan", 666, 2200, "red", parts);
        Car dodge = new Car("nissan", 666, 2200, "blue", parts);
        Car nissane2 = new Car(nissan);

        nissane2.setColor("yellow");
        nissane2.setParts(new String[] {"tires", "filters"});

        System.out.println(nissan.getColor());
        System.out.println(dodge.getPrice());

        double price = nissan.getPrice() / 2;
        nissane2.setPrice(price);

        nissan.drive();
        System.out.println(nissan.getPrice());
        System.out.println(nissane2.getPrice());
        System.out.println(Arrays.toString(nissan.getParts()));
        System.out.println(Arrays.toString(nissane2.getParts()));
        nissane2.drive();
       System.out.println(dodge.toString());
       Car[] cars = new Car[] {
               new Car("nissan", 666, 2200, "red", parts),
               new Car("nissan14", 666, 2200, "red", parts),
               new Car("nissan5", 66, 200, "red", parts),
               new Car("honda", 66, 200, "junk", parts),
               new Car("honda", 66, 200, "black",  new String[]  {"tires", "keysA"})
       };
       DealerChip dealerChip = new DealerChip(cars);
        for (int i = 0; i < cars.length ; i++) {
            dealerChip.setCars(cars[i], i);
        }
        dealerChip.setCars(dodge, 2);
        System.out.println(dealerChip.getCar(0));

        Car newCar = dealerChip.getCar(0);
        newCar.setColor("blue");
        System.out.println(newCar.toString());
        System.out.println(dealerChip.getCar(0).toString());

        dealerChip.sell(2);
        System.out.println(dealerChip.search("nissan", 666));
        System.out.println(dealerChip);

        Scanner scan = new Scanner(System.in);

        String choice = scan.nextLine();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <=i ; j++) {
                if (i ==j ) {
                    System.out.println(" * ");
                } else {
                    System.out.println("   ");
                }
            }
        }

        int[][] matrix = {
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
        };

        // exeptions
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = i;
                System.out.println(matrix[i][j]);
            }
        }


        // try in catch for inchecked exeptions
        int[] array = new int[3];
        try {
            System.out.println(array[5]);
            String word = null;
            word.toLowerCase(Locale.ROOT);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

}
