package statements;

public class loop1 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("for");
        }

        while (true) {
            System.out.println("while");
            break;
        }

        do {
            System.out.println("do while");
        } while (false);

        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = i + 1;
        }
        for (int a : x) {
            System.out.print(a+" ");
        }
    }

}
