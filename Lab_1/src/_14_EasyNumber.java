import java.util.Scanner;

public class _14_EasyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Нам нужно натуральное число");
            } else {
                boolean isEasy = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isEasy = false;
                    }
                }
                System.out.println("Число простое? Ответ: " + isEasy);
                if (!isEasy) {
                    System.out.println("Все простые делители для вашего числа:");
                    for (int i = 2; i < num; i++) {
                        isEasy = true;
                        for (int j = 2; j <= Math.sqrt(i); j++) {
                            if (i % j == 0) {
                                isEasy = false;
                            }
                        }
                        if (isEasy && num % i == 0) {
                            System.out.print(i + " ");
                        }
                    }
                }
            }
        } else {
            System.out.println("Нам нужно натуральное число");
        }
    }
}
