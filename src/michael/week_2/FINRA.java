package michael.week_2;

import java.util.Arrays;

public class FINRA {
    /*
    FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.
     */

  //  1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA ...

    public static void main(String[] args) {
        FINRA_1();
        System.out.println();
        FINRA_2();
        System.out.println();
        FINRA_3();
    }
    public static void FINRA_1() {
        String result = "";
        for(int i=1; i <= 30; i++) {
            if(i % 5==0 && i %3 ==0)
                result += "FINRA ";
            else if(i%5 == 0)
                result += "RA ";
            else if(i%3==0)
                result+="FIN ";
            else
                result += i+" ";
        }
        System.out.println(result);
    }


    public static void FINRA_2() {
        String result = "";
        for(int i=1; i <= 30; i++) {
            result += (i % 5 ==0 && i %3 ==0)? "FINRA " : (i%5 == 0) ? "RA "
                    :(i%3 == 0) ? "FIN " : i+" ";
        }
        System.out.println(result);
    }


    public static void FINRA_3 () {
        for (int i = 1; i <= 30; i++) {
            String result= "";
            if (i%3==0) result +="FIN";
            if (i%5==0) result += "RA";

            System.out.print(result.isEmpty() ? i+ " ": result+" ");
        }
    }


}
