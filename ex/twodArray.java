package ex;

import java.sql.Array;
import java.util.Arrays;

public class twodArray {
    public static void main(String[] args) {
        int[][] grades = {
                {45, 67, 66, 67},
                {45, 67, 66, 67},
                {45, 67, 66, 67},
        };
        System.out.println("/nharry" + Arrays.toString(grades[0]));
        System.out.println("/nharry" + Arrays.toString(grades[1]));
        System.out.println("/nharry" +Arrays.toString(grades[2]));
        grades[0][0] = 34;
        grades[0][1] = 3;
        grades[0][2] = 4;
        grades[0][3] = 44;
        for(int i = 0; i< grades[0].length-1 ; i++) {
            switch (i) {
                case 0: System.out.println("harry");
                case 1: System.out.println("harry");
                case 3: System.out.println("harry");
                default: System.out.println("");
            }
            for(int j = 0; j< grades[0].length-1 ; j++) {
                System.out.println(grades[i][j]);
            }
        }
       char[][] board = {
                {'_','_','_',},
                {'_','_','_',},
                {'_','_','_',},
        };
        System.out.println(board);
        public static void boradp() {
            System.out.println(board);
        }

    }
}
