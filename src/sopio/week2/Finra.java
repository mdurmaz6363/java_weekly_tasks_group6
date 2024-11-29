package sopio.week2;

public class Finra {
    public static void main(String[] args) {

        finraNumberCount();
        System.out.println("--------------------------");
        finraNumberCount2();

    }

    public static void finraNumberCount (){
        for (int i = 1; i <=30 ; i++) {
            if (i%3==0 && i%5==0){
                System.out.print("Finra ");
            } else if (i%5==0) {
                System.out.print("Ra ");
            }else if (i%3==0){
                System.out.print("Fin ");
            }else {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void finraNumberCount2 (){
        for (int i = 1; i <=30; i++) {
            String result= "";

            if (i%3==0) result +="Fin";
            if (i%5==0) result += "Ra";
            System.out.print(result.isEmpty() ? i+ " ": result+" ");
        }
    }

}
