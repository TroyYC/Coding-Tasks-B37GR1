package neziha_weekly_task_solutions;

import jdk.jfr.Frequency;

public class FrequencyOfCharacters_W5 {

    /*
    Write function that can find the frequency of characters

            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


     */

    public static void main(String[] args) {

        String letters = "AAABBCDD";
        String result = frequencyOfChars(letters);
        System.out.println(result);

    }

    public static String frequencyOfChars(String str) {
        String result = "";
        int count = 1;


        for (int i = 0; i < str.length() ;i++) {

            if (i< str.length()-1 && str.charAt(i) == str.charAt(i + 1)) {
              //  i=str.charAt(i);
                count++;
            } else {

                result += str.charAt(i) + String.valueOf(count);
                count = 1;
            }

        }
        return result;
    }


}
