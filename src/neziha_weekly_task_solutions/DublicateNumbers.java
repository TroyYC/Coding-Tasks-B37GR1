package neziha_weekly_task_solutions;

public class DublicateNumbers {
    public static void main(String[] args) {

        String letters="AAABBBCCC";
        String Result =DuplicatedNumbers(letters);
        System.out.println(Result);
    }

     /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static String DuplicatedNumbers(String str) {
        String dublicateNumbers = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!dublicateNumbers.contains(String.valueOf(ch))) {
                dublicateNumbers += ch;
            }

        }
        return dublicateNumbers;
    }


}


