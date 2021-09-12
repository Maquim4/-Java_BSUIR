public class _25_Fibonacci20 {
    public static void main(String[] args) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        int[] arr;
        arr = new int[20];
        arr[0]=1;
        arr[1]=1;
        System.out.print(arr[0] + " " + arr[1] + " ");
        for(int i = 2; i < 20; i++ ){
            n2 = n0 +n1;
            arr[i] = n2;
            System.out.print(arr[i] + " ");
            n0 = n1;
            n1 = n2;
        }
    }
}
