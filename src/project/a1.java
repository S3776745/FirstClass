package project;

import java.util.Scanner;

public class a1 {

    /*Please make a Morse code translator for numbers
    0 －－－－－
    1.－－－－
    2 . .－－－
    3 . . .－－
    4. . . .－
    5. . . . .
    6－. . . .
    7－－. . .
    8－－－. .
    9－－－－.
    */



























    static String[] morse = {"-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Convert to Morse Code");
            System.out.println("2. Decrypt Morse Code");
            System.out.println("3. Exit");
            System.out.print("Please pick the service:");
            switch (input.next()) {
                case "1":
                    System.out.print("\nPlease enter the numbers:");
                    convert(input.next());
                    break;
                case "2":
                    System.out.print("\nPlease enter the Morse Code:");
                    decypt(input.next());
                    break;
                case "3":
                    System.out.println("\nBye.");
                    exit = true;
                    break;
                default:
                    System.out.println("\nPlease enter the correct number.");
                    break;
            }
        }
    }

    static void convert(String x) {
        int[] number = new int[x.length()];
        for (int i = 0; i < number.length; i++) {
            number[i] = x.charAt(i) - '0';
            System.out.print(morse[number[i]]);
        }
        System.out.println();
    }

    static void decypt(String x) {
        for (int i = 0; i < x.length(); i = i + 5) {
            for (int j = 0; j < morse.length; j++) {
                if (x.substring(i, i + 5).equals(morse[j])) {
                    System.out.print(j);
                }
            }
        }
        System.out.println();
    }

}
