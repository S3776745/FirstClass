package statements;

import java.util.Scanner;

public class tryCatch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] y = new int[5];
        y[10] = 1;
        try {

        }catch (Exception e){
            System.out.println(e);
        }

    }

}
