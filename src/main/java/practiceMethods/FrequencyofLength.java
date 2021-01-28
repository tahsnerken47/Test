package practiceMethods;
/*
 Write a Java method to count all words in a string. Go to the editor
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:

Number of words in the string: 9
 */
public class FrequencyofLength {

    public static int countofLength(String str) {

        int count = 0;
        for (String each : str.split(" ")) { // each word
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(countofLength("The quick brown fox jumps over the lazy dog."));

    }
}

