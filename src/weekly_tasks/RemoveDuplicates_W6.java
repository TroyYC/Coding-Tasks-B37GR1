package weekly_tasks;

public class RemoveDuplicates_W6 {

    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    //Ugur is volunteer



    public static String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {//f
                result += "" + str.charAt(i);//ABC
            }
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
    }







}
