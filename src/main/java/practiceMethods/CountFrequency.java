package practiceMethods;

import java.util.Arrays;

public class CountFrequency {
    /*
    Write a Java method to count all vowels in a string. Go to the editor
    Test Data:
    Input the string: w3resource
    Expected Output:

    Number of  Vowels in the string: 4
     */
    public static int frequency(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==('a') || str.charAt(i)==('e') || str.charAt(i)==('i') || str.charAt(i)==('o')) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("frequency(\"hello\") = " + frequency("hello"));

    }
}
