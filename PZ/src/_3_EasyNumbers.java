import java.util.Scanner;
// не сделала
public class _3_EasyNumbers {
    public static boolean easyNumber(int num) {
        boolean isEasy = true;
        for ( int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0){
                isEasy = false;
                return isEasy;
            }
        }
        return isEasy;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean isVariableRight = false;
        while(!isVariableRight){
            System.out.println("Введите границу n:");
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
            boolean first = easyNumber(i);
            boolean second = easyNumber(i+2);
            if( (i+2) > n*2){
                second = false;
            }
            if( first && second ) {
                System.out.println( i + " and " + (i+2) );
            }
        }
    }
}
