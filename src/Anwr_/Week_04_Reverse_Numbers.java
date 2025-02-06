package Anwr_;

public class Week_04_Reverse_Numbers {


    //    Numbers -- Reverse negative number
//    Write a return method that can reverse
//    negative number and return it as int


        public static void main(String[] args) {

            int num = -2567;
            int reversedNumber = reverseNegativeNum(num);
            System.out.println(" The Reversed number is: " + reversedNumber);


        }
        public static int reverseNegativeNum(int num){
            String numStr = String.valueOf(Math.abs(num));
            String reversedStr = "";
            for (int i = numStr.length() - 1; i >= 0; i--) {
                reversedStr += numStr.charAt(i);
            }
            int reversed = Integer.parseInt(reversedStr);
            if(num <0){
                return -reversed;
            }else {
                return reversed;
            }


        }



}
