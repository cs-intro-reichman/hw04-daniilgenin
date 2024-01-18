public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        //System.out.println(capVowelsLowRest(null));
        System.out.println(allIndexOf("Hello world",'l'));
    }
    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String str = "";
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'o' || currentChar == 'u' || currentChar == 'i') {
                str += (char) (currentChar - 'a' + 'A');
            }   
            else if (currentChar == 'A' || currentChar == 'E' || currentChar == 'O' || currentChar == 'U' || currentChar == 'I') {
                str += currentChar;
            }
            else{
                str += currentChar;
            }

            
        }
        return str;
    }

    public static String camelCase (String string) {
        // Write your code here:

        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if (chr == string.charAt(i)){
                count += 1;
            }
        }
        int array[] = new int [count];
        for (int i = 0; i < string.length(); i++){
            for (int n = 0; n < array.length; n++){
                if (chr == string.charAt(i)){
                    array[n] = chr;
                }
            }
        }
        return array;
    }
}
