package Exe13072024;

public class Lab008 {

    public static void main(String[] args) {


        // Relational Operators -> boolean
        //    // >, < >=,<=, == , != ( ! = ) - true or false.
        int a = 12;
        boolean b = !(a > 10 || a < 5); // BODMAS
        System.out.println(b);
        // BODMAS stands for
        // Bracket, Of, Division,
        // Multiplication, Addition, and Subtraction.


        boolean ab = true;
        System.out.println(!ab);
        System.out.println(!(10>20));
        System.out.println(!!!!(30>90));
        //  System.out.println((30>90)!);


        System.out.println( 10 == 10); // == Compare true values
        System.out.println( 10 >= 10); //  10> 10 or 10 = 10
        System.out.println( 10 <= 10); // 10 < 10 or 10 = 10
        System.out.println( 10 > 10);
        System.out.println( 10 < 10);


        int _a = 10;
        int _b = 10;
        boolean c = (10 >= 10); // 10 > 10 or 10 = 10
        // OR GATE
        System.out.println(c);


    }
}
