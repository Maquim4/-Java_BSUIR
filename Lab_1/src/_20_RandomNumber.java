public class _20_RandomNumber {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 899) + 100;
        int max;
        int n1 = num / 100, n2 = num / 10 % 10, n3 = num % 10;
        if ( n1 >= n2 && n1 >= n3) {
            max = n1;
        } else if ( n2 >= n1 && n2 >= n3) {
            max = n2;
        } else {
            max = n3;
        }
        System.out.println("В числе " + num + " наибольшая цифра " + max );
    }
}
