package statements;

import java.util.Scanner;

public class test2 {

    //1 for add, 2 for subtract, 3 for multiply, 4 for divide, 0 for exit









































    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean boo = true;
        int a,b;
        while (boo) {
            try {
                System.out.println("a:");
                a = input.nextInt();
                System.out.println("b:");
                b = input.nextInt();
                System.out.println("1. add");
                System.out.println("2. subtract");
                System.out.println("3. multiply");
                System.out.println("4. divide");
                System.out.println("0. exit");
                System.out.print("Please enter the number:");
                switch (input.next()) {
                    case "1":
                        System.out.println(a + b);
                        break;
                    case "2":
                        System.out.println(a - b);
                        break;
                    case "3":
                        System.out.println(a * b);
                        break;
                    case "4":
                        System.out.println(a / b);
                        break;
                    case "0":
                        boo = false;
                        break;
                    default:
                        System.out.println("\nPlease enter the correct number.");
                        break;
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

}
