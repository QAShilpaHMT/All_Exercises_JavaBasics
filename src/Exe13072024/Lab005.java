package Exe13072024;

public class Lab005 {

    public static void main(String[] args) {
        // Formatting
        int age = 98;
        System.out.println("You age is -> " + age);
        // %d ->  any integer - byte, short, int or long
        // %s -> String
        // %c -> char
        // %f -> float
        System.out.printf("You age is -> %d",age);
        int n = 9;
        System.out.printf("%d",n);
        String name = "shilpa";
        System.out.printf("Your name is -> %s",name);

        // Calc
        double a = 10;
        double b = 34;
        double sum  = a+b;
        double sub  = a-b;
        double mul  = a*b;
        double div  = a/b;
//        double div  = a/b;
        System.out.printf("Sum is %f\n",sum);

        System.out.printf("Sub is %f\n",sub);

        System.out.printf("Mul is %f\n",mul);

        System.out.printf("Div is %f\n",div);
    }
}
