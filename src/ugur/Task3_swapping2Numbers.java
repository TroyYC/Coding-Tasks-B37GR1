package ugur;

public class Task3_swapping2Numbers {

    public static void main(String[] args) {



        int a = 5; //7
        int b = 7; //5

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;// 12
        b = a - b;//  5
        a = a - b;//  7

        System.out.println("a = " + a); //=> a = 7
        System.out.println("b = " + b); //=> b = 5

        System.out.println("===================== ");

        int c;

        c = a;
        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
