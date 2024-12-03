package ugur;

public class Task3_swapping2Numbers {

    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a); //=> a = 7
        System.out.println("b = " + b); //=> b = 5


    }
}
