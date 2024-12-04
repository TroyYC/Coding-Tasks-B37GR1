package fatih_solutions;

public class Finra {

    public static void main(String[] args) {

        printNumber();
    }



    public static void printNumber(){

        for (int i = 1; i <= 30; i++) {
            //if (i % 3 == 0 && i % 5 == 0)
            if (i % 15 == 0){
                System.out.println("FINRA");
            }else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            }else {
                System.out.println(i);
            }

        }

    }

}
