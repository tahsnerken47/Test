package practiceMethods;

public class MaxNum {



    public static int maxNum(){
     int   num1=25;
      int  num2=37;
       int num3=29;

        if(num1>num2 && num1>num3){
         return num1;
        }else if(num2>num3 && num2>num1){
            return num2;
        }else{
            return num3;
        }
    }

    public static void main(String[] args) {
        System.out.println("smallestNum() = " + maxNum());
    }
}
