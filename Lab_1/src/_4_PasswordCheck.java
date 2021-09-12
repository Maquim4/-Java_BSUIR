import java.util.Scanner;

public class _4_PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword, password = "";
        correctPassword = "forgotAllTypes123";
        while (!correctPassword.equals(password)) {
            System.out.println("Введите пароль :");
            password = sc.nextLine();
        }
        System.out.println("Поздравляю, вы ввели правельный пароль!!!");
    }
}
