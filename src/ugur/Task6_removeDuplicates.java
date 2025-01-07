package ugur;

public class Task6_removeDuplicates {

    public static void main(String[] args) {

        String str = "AAABBBCCC";

        System.out.println("str = " + str);
        System.out.println("removeDuplicate(str) = " + removeDuplicate(str));
    }

    public static String removeDuplicate(String str) {
        String reversed = ""; //

        for (int i = 0; i <= str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            //  System.out.println(reversed.indexOf(currentChar));

            System.out.println("currentChar = " + currentChar);
            System.out.println("reversed = " + reversed);
            System.out.println("reversed.indexOf(currentChar) = " + reversed.indexOf(currentChar));

            if (reversed.indexOf(currentChar) == -1) {
                reversed += currentChar;
            }
        }
        return reversed;
    }
}
