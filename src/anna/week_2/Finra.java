package anna.week_2;

public class Finra {
    public static void main(String[] args) {
        int a = 30;
        finra(a);

    }
    public static void finra(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA" + " ");

            } else if (i % 3 == 0) {
                System.out.print("FIN" + " ");

            } else if (i % 5 == 0) {
                System.out.print("RA" + " ");

            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
/*
    FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.

// 1  2  FIN  4  RA FIN 7 8  FIN  RA 11  FIN 13 14 FINRA ...
 */