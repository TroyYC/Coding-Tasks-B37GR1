package Kamola_solutions;

public class W8_ReverseString {

    public static String reverseStr(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();

        /*
        public static String reverse(String str) {
            return new StringBuilder(str).reverse().toString();}
         */
    /*
        String backward = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            backward += str.charAt(i);
        }
       return backward;
    }
   */

    }

    public static void main(String[] args) {
        String input = "ABCD";
        System.out.println(reverseStr(input));
    }

}