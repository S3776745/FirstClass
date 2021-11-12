package signs;

public class signs {

    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("a+b: "+(a+b));
        System.out.println("a-b: "+(a-b));
        System.out.println("a*b: "+(a*b));
        System.out.println("a/b: "+(a/b));
        System.out.println("a%b: "+(a%b)); //remainder, 余数, 나머지
        System.out.println("a++: "+(a++));
        System.out.println("a--: "+(a--));
        System.out.println("++a: "+(++a));
        System.out.println("--a: "+(--a));

        if (a==b){
            System.out.println("a==b");
        }

        if (a!=b){
            System.out.println("a!=b");
        }

        if (a==10 && b==1){
            System.out.println("&&");
        }

        if (a==2 & b==1){
            System.out.println("&");
        }

        if (a==10 || (b=2)==1){
            System.out.println("|| b:"+b);
        }

        if (a==10 | (b=2)==1){
            System.out.println("| b:"+b);
        }

    }

}
