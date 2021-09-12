import java.util.Scanner;

public class _5_Sum_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во цифр в числе (лучше 1-4):");
        if (sc.hasNextInt()){
            int n = sc.nextInt();
            if (n>0 && n<5){
                int lastNumberPlus1 = 1;
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    lastNumberPlus1 = lastNumberPlus1 * 10;
                }
                for (int i = lastNumberPlus1 - 1 ; i >= lastNumberPlus1 / 10; i--) {
                    sum += i;
                }
                System.out.println("Сумма всех " + n + "-значных чисел равна " + sum);
            } else {
                System.out.println("Лучше ввести от 1 до 4");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
