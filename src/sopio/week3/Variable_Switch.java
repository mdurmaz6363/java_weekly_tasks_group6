package sopio.week3;

public class Variable_Switch {
    public static void main(String[] args) {

        switchVariables(2, 33);


    }

    public static void switchVariables (int num1, int num2){
        num2 = num1+num2;
        num1 = num2-num1;
        num2 = num2-num1;

        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);


    }
}
