package weekly_tasks;

public class FrequencyOfCharacters_W5 {

     /*
    Write function that can find the frequency of characters

            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

            Gylfye


     */

    public static String frequencyOfChars1(String str) {
        String expectedResult = "";
        int j = 0;
        while (j < str.length()) {//aaabbbcccdddEEEFFF
            int count = 0;
            for (int i = 0; i < str.length(); i++) {//aaabbbcccdddEEEFFF
                if (str.charAt(i) == str.charAt(j)) {
                    count++;//3
                }
            }
            expectedResult += str.charAt(j) + "" + count;//b3
            str = str.replace("" + str.charAt(j), "");
            System.out.println(str);

        }
        return expectedResult;
    }
}
