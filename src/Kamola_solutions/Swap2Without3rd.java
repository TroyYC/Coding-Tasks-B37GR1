package Kamola_solutions;

public class Swap2Without3rd {
    public static void main(String[] args) {

        int a = 5, b = 7;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b; // a becomes 12
        b = a - b; // b becomes 5
        a = a - b; // a becomes 7

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}




    }
}
