public class _15_Fibonacci {
    public static void main(String[] args) {
        int n0 = 1, n1 = 1, n2;
        System.out.println(n0);
        System.out.println(n1);
        for(int i = 2; i < 11; i++ ){
            n2 = n0 +n1;
            System.out.println(n2);
            n0 = n1;
            n1 = n2;
        }
    }
}
