import java.util.Scanner;

public class _3_XandY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите действительные числа X и Y не равные друг другу");
        System.out.println("X :");
        while (!sc.hasNextDouble()) {
            System.out.println("Это не число");
            System.out.println("Введите число X ещё раз:");
            sc.next();
        }
        double x =  sc.nextDouble() ;
        System.out.println("Y :");
        while (!sc.hasNextDouble()) {
            System.out.println("Это не число");
            System.out.println("Введите число Y ещё раз:");
            sc.next();
        }
        double y = sc.nextDouble() ;
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
