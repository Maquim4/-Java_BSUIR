import java.util.Scanner;

public class _1_Stepen {
    public static void main(String[] args) {
        System.out.println("Введите число n:");
        Scanner sc = new Scanner(System.in);
        double n ;
        if (sc.hasNextDouble()) {
            n = sc.nextDouble();
            for(int i = 0; i < 4; i++){
                System.out.println(Math.pow(n,i));
            }
        } else {
            System.out.println("Вы ввели не число");
        }
    }
}
