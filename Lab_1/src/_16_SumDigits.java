import java.util.Scanner;

public class _16_SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int sum = 0;
        if (sc.hasNextInt()){
            int num = sc.nextInt();
            if (num <= 0){
                System.out.println("Нам нужно натуральное число");
            } else {
                for(int i = num; i != 0; i /= 10){
                    sum += i % 10;
                }
                System.out.println("Cумму всех его цифр:");
                System.out.println(sum);
            }
        } else {
            System.out.println("Нам нужно натуральное число");
        }
    }
}
