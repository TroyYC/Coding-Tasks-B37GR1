package ugur;

public class Task7_findUnique {


     /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        System.out.println(str);
        System.out.println("Unique " + findUnique(str));

    }

    public static String findUnique(String str) {

        String unique1 = str.charAt(0)+ "";
        String unique = "";

        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (unique1.contains(str.charAt(i) + "")) {
                unique1 += str.charAt(i);
                count++;
                if (count<=1){
                    unique = str.charAt(i)+"";
                }
            }

        }
        return unique;
    }

}
