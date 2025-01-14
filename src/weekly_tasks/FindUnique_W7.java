package weekly_tasks;

public class FindUnique_W7 {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        System.out.println("Str = " + str);
        System.out.println("Unique = " + findUnique(str));
    }

    public static String findUnique(String str) {

        String unique = ""; //

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                System.out.println(str.indexOf(currentChar));
                System.out.println(str.lastIndexOf(currentChar));

                // The character is unique if its first and last occurrence are the same.
                unique += currentChar + "";
            }

        }
        return unique;
    }
     /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */
    //Mokhinur
}
