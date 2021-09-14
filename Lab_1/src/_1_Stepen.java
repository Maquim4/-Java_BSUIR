import java.util.Scanner;

public class _1_Stepen {
    public static void main(String[] args) {
        System.out.println("Введите число n:");
        Scanner sc = new Scanner(System.in);
        double n ;
        while (!sc.hasNextDouble()) {
            System.out.println("Это не число");
            System.out.println("Введите число n:");
            sc.next();
        }
        n = sc.nextDouble();
        System.out.println("Первые 4 степени:");
        for(int i = 0; i < 4; i++){
            System.out.println(Math.pow(n,i));
        }
    }
}
