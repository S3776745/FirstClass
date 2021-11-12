package dataType;


public class basics {

    static int i;
    static char c;
    static String s;
    static boolean b;
    static float f;
    static double d;

    public static void main(String[] args) {
        defultprint();
    }

    public static void defultprint() {
        System.out.println(i);
        System.out.println(c);
        System.out.println(s);
        System.out.println(b);
        System.out.println(f);
        System.out.println(d);
    }

    public static void convert() {
        // int to String
        int a = 10;
        String s1 = a + "";
        String s2 = Integer.toString(a);
        String s3 = String.valueOf(a);

        //String to int
        String s4 = "1";
        a = Integer.parseInt(s4);

        // int to double and float
        double d = a;
        float f = a;

        //String to double and float
        d = Double.parseDouble(s4);
        f = Float.parseFloat(s4);

        //char to int
        char c = '1';
        a = c + '0';
        a= (int)c;

        //char[] to String
        char[] cc1 = {'1','a'};
        String ss1 = new String(cc1);

        //String to char[]
        String s5="123456";
        char[] cc2 = s5.toCharArray() ;

        //String to int[]
        s4 = "123123123";
        int[] ii1 = new int[s4.length()];
        for(int i=0;i<s4.length();i++) {
            ii1[i]  = s4.charAt(i)-'0';
        }

        //int[] to String??


    }

    public static void stirng() {
        String s = "AAAAA,aaaaa";
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.split(","));
        System.out.println(s.substring(4, 7));
    }

}
