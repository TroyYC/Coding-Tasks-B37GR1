package ugur;

public class Task6_removeDuplicates {

    public static void main(String[] args) {

        String str = "AAABBBCCC";

        System.out.println("str = " + str);
        System.out.println("removeDuplicate(str) = " + removeDuplicate(str));
    }

    public static String removeDuplicate(String str) {
        String removed = ""; //

        for (int i = 0; i <= str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            //  System.out.println(removed.indexOf(currentChar));

//            System.out.println("currentChar = " + currentChar);
//            System.out.println("removed = " + removed);
//            System.out.println("removed.indexOf(currentChar) = " + removed.indexOf(currentChar));

            if (removed.indexOf(currentChar) == -1) {
                removed += currentChar;
            }
        }
        return removed;
    }
}
