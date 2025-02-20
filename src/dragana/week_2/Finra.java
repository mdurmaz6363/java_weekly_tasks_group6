package dragana.week_2;

public class Finra {

    public static void main(String[] args) {
        finraMethod();
    }


    public static void finraMethod() {

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }
        }
    }


    public static void finra(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] % 5 == 0) {
                System.out.print("FINRA");
            } else if (numbers[i] % 3 == 0) {
                System.out.print("FIN");
            } else if (numbers[i] % 5 == 0) {
                System.out.print("RA");
            } else {
                System.out.print(numbers[i]);
            }


        }
        System.out.println();
    }


    public static void finra(int num) {


        if (num % 3 == 0 && num % 5 == 0) {
            System.out.print("FINRA");
        } else if (num % 3 == 0) {
            System.out.print("FIN");
        } else if (num % 5 == 0) {
            System.out.print("RA");
        } else {
            System.out.print(num);
        }
        System.out.println();
    }


    public static void finra(int num, int num2) {

        for (int i = num; i < num2; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA");
            } else if (i % 3 == 0) {
                System.out.print("FIN");
            } else if (i % 5 == 0) {
                System.out.print("RA");
            } else {
                System.out.print(i);
            }
        }
    }

}




  /*
    FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.
     */

//  1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA ...
