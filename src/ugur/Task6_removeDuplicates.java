package ugur;

import java.util.ArrayList;

public class Task6_removeDuplicates {

    public static void main(String[] args) {

        String str = "AAABBBCCC";

        System.out.println(removeDup(str));
    }

    public static String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            //  System.out.println(result.indexOf(currentChar));

            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }

//            if (!result.contains(String.valueOf(currentChar))){
//                System.out.println("String.valueOf(currentChar) = " + String.valueOf(currentChar));
//                result+=currentChar;
//            }

        }
        return result;
    }
}
