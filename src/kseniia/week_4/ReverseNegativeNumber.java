package kseniia.week_4;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        int num = -12345;
        int reversedNumber = reverseNegativeNum(num);
        System.out.println("Reversed number: " + reversedNumber);

       
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

//    Numbers -- Reverse negative number
//    Write a return method that can reverse
//    negative number and return it as int

