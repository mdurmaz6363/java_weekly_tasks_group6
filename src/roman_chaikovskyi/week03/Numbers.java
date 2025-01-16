package roman_chaikovskyi.week03;

public class Numbers {

    public static void main(String[] args) {

    int x = -123;
    int reversedX = 0;

    while (x != 0){
        reversedX = reversedX * 10 + x % 10;
        x = x/10;
    }
        System.out.println("Reversed number is: " + reversedX);


    }
}



/*
`2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */
