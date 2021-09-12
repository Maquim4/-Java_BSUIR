import java.util.Scanner;

public class _13_PositiveDivider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        if (sc.hasNextInt()){
            int num = sc.nextInt();
            if (num <= 0){
                System.out.println("Нам нужно натуральное число");
            } else {
                System.out.println("Все положительные делители для вашего числа:");
                for (int i = 1; i <= num; i++){
                    if (num % i == 0){
                        System.out.println(i);
                    }
                }
            }

        } else {
            System.out.println("Нам нужно натуральное число");
        }

    }
}
