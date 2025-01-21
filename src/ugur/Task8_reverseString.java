package ugur;

public class Task8_reverseString {

  /*
    Write a function that can reverse a String
        Ex: Reverse("ABCD"); ==> DCBA
     */
  public static String reverseStr(String str) {
      if (str == null || str.isEmpty()) {
          return str;
      }

      String reversed = "";
      for (int i = str.length() - 1; i >= 0; i--) {
          reversed+= (str.charAt(i));
      }

      return reversed;
        /*
        public static String reverse(String str) {
            return new StringBuilder(str).reverse().toString();}
         */
  }

    public static void main(String[] args) {
        String input = "ABCD";
        System.out.println(input);
        System.out.println(reverseStr(input));
    }
    //Kamola is volunteer

}
