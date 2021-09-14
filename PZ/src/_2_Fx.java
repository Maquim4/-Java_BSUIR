import java.util.Scanner;

public class _2_Fx {
    public static void main(String[] args) {
        System.out.println("Программа для вычисления значений функции F(x)\n" +
                "на отрезке [а, b] с шагом h:");
        Scanner sc = new Scanner(System.in);
        double a = 0, b = 0,  h = 0;
        System.out.println("Введите границу a:");
        while (!sc.hasNextDouble()) {
            System.out.println("Это не число");
            System.out.println("Введите границу a:");
            sc.next();
        }
        a = sc.nextDouble();
        boolean isVariableCorrect = false;
        while ( !isVariableCorrect ){
            System.out.println("Введите границу b:");
            while (!sc.hasNextDouble()) {
                System.out.println("Это не число");
                System.out.println("Введите границу b:");
                sc.next();
            }
            b = sc.nextDouble();
            if ( b <= a ){
                System.out.println("b должно быть больше a");
            } else {
                isVariableCorrect = true;
            }
        }
        System.out.println("Введите шаг h:");
        while (!sc.hasNextDouble()) {
            System.out.println("Это не число");
            System.out.println("Введите шаг h:");
            sc.next();
        }
        h = sc.nextDouble();
        for (double i = a; i <= b; i = i + h){
            double func = 1 / (2 * Math.tan( i / 4 )) + 4;
            System.out.println("x: " + i + " result: " + func);
        }
    }
}
