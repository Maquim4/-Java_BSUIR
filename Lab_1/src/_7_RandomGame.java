import java.util.Scanner;

public class _7_RandomGame {
    public static void main(String[] args) {
        int correctNumber, userNumber = 0;
        correctNumber = (int) (Math.random() * 9) +1;
        while (!(correctNumber == userNumber)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите предпологаемое число :");
            if (sc.hasNextInt()){
                userNumber = sc.nextInt();
                if (userNumber != correctNumber) {
                    if (userNumber > correctNumber) {
                        System.out.println("Загаданное число меньше");
                    } else {
                        System.out.println("Загаданное число больше");
                    }
                }
            } else {
                System.out.println("Вы ввели не число");
            }
        }
        System.out.println("Поздравляю, вы угадали!!!");
    }
}
