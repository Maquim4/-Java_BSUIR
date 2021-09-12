import java.util.Scanner;

public class _6_Sum_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во цифр в числе (лучше 1-4):");
        if (sc.hasNextInt()){
            int n = sc.nextInt();
            if (n>0 && n<5){
                System.out.println("Введите целое число, которому должны быть кратны слагаемые:");
                int k;
                if (sc.hasNextInt()) {
                    k = sc.nextInt();
                    int lastNumberPlus1 = 1;
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        lastNumberPlus1 = lastNumberPlus1 * 10;
                    }
                    for (int i = lastNumberPlus1 - 1; i >= lastNumberPlus1/10; i--) {
                        if( i % k == 0 )  sum += i;
                    }
                    System.out.println("Сумма всех " + n + "-значных чисел,кратных " + k + " равна " + sum);
                } else {
                    System.out.println("Вы ввели не целое число");
                }
            } else {
                System.out.println("Лучше ввести от 1 до 4");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
