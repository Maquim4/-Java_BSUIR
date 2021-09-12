import java.util.Scanner;
// не сделала
public class _3_EasyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        Boolean isVariableRight = false;
        while(!isVariableRight){
            System.out.println("Введите границу a:");
            while (!sc.hasNextInt()) {
                System.out.println("Это не натуральное число.");
                sc.next();
            }
            n = sc.nextInt();
            if ( n > 2 ){
                isVariableRight = true;
            } else {
                System.out.println("Введённое число меньше 2х.");
            }
        }
        for (int i = n; i <= 2 * n; i++) {
            for ( int c = 2; c < Math.sqrt(i); c++) {
                if ( i%c == 0) {
                    return;
                } else {

                }
            }
            System.out.println("Very well! It's simple!");
        }
    }
}
