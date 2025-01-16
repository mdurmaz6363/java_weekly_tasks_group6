package roman_chaikovskyi.week02;

public class FINRA {

    public static void main(String[] args) {


        for (int i = 1; i <= 30; i++) {

            boolean b3 = i % 3 == 0;
            boolean b5 = i % 5 == 0;
            String result = "";


            if (b3 && b5) {
                result = "FINRA";
            } else if (b3) {
                result = "FIN";
            } else if (b5) {
                result = "RA";
            } else {
                result = "" + i;

            }
            System.out.print(result + " ");
        }

    }

}


/*
    FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.


//  1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA ...
 */
