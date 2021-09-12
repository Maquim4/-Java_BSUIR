import java.util.Scanner;

public class _3_XandY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите действительные числа X и Y не равные друг другу,"
                + " при неверном вводе мы подставим 7.8 и 8.9:");
            double x =  sc.hasNextDouble() ? sc.nextDouble() : 4.6;
            double y = sc.hasNextDouble() ? sc.nextDouble() : 8.9;
            if(x == y){
                System.out.println("X и Y должны быть разные");
            } else {
                double halfSum = (x + y) / 2;
                double doubleMultiply = x * y * 2;
                if (x > y) {
                    y = halfSum;
                    x = doubleMultiply;
                } else {
                    x= halfSum;
                    y = doubleMultiply;
                }
                System.out.println("X = " + x +"  "+ "Y = " + y);
            }
    }
}
