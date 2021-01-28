package practiceMethods;
/*
Write a Java method to display the middle character of a string. Go to the editor
Note:
a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.
Test Data:
Input a string: 350
 */
public class MiddleChracter {


    public static void middleChar(String str){

        String result="";
        String middleChar = str.substring(str.length()/2);
        if(str.length() %2 ==0){


            System.out.println(middleChar.substring(0,2));
        }else{
            System.out.println(middleChar.substring(0,1));
        }




    }

    public static void main(String[] args) {
        middleChar("kahot");
    }
}
