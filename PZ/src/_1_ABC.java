import java.util.Scanner;

public class _1_ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0.0, b = 0.0, c = 0.0;
        System.out.println("Введите действительное числo a:");
        while (!sc.hasNextDouble()) {
            System.out.println("Это не число");
            sc.next();
        }
        a = sc.nextDouble();
        System.out.println("Введите действительное числo b:");
        while (!sc.hasNextDouble()) {
            System.out.println("Это не число");
            sc.next();
        }
        b = sc.nextDouble();
        System.out.println("Введите действительное числo c:");
        while (!sc.hasNextDouble()) {
            System.out.println("Это не число");
            sc.next();
        }
        c = sc.nextDouble();
        if(a > b && b > c){
            a*=2;
            b*=2;
            c*=2;
            System.out.println("а > b > с => удваиваем значения и получаем:");
            System.out.println("а = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
        } else {
            a=Math.abs(a);
            b=Math.abs(b);
            c=Math.abs(c);
            System.out.println("Значения не соответсвуют неравенству а > b > с => выводим абсолютные значения и получаем:");
            System.out.println("а = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
        }
    }
}
