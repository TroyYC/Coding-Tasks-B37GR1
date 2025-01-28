package Kamola_solutions;
 /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */

public class W7_UniqueCharacters {
    //OPT-1
    public static String findUnique(String str) {
        StringBuilder unique = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                unique.append(ch);
            }
        }
        return unique.toString();
    }


    //OPT-2
    public static String findUnique2(String str) {
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                unique += ch;
            }
        }
        return unique;
    }


    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        String result = findUnique(str);
        String result2 = findUnique2(str);
        System.out.println("Unique characters: " + result);
        System.out.println("Unique characters: " + result2);
    }
}
