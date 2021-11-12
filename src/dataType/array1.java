package dataType;

public class array1 {

    public static void main(String[] args) {
        int[] a;
        int[] b = new int[5];
        int[] c = {1, 2, 3};
        int[][] d = {{1, 2, 3}, {1, 2, 3,}, {1, 2, 3,}};
        int[][] e = new int[1][];
        c[1] = 9;

        for (int i = 0; i < b.length; i++) {
            b[i] = i + 1;
        }

        for (int x : b) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = j + 1;
            }
        }

        for (int[] x : d) {
            for (int y : x) {
                System.out.print(y + " ");
            }
        }

    }

}
