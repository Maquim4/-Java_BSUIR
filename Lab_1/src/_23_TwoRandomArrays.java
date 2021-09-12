public class _23_TwoRandomArrays {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int sum1 = 0;
        int sum2 = 0;
        arr1 = new int[5];
        arr2 = new int[5];

        System.out.println("Изначальные:");
        System.out.println("arr1: ");
        for (int i = 0; i < 5; i++) {
            arr1[i] = (int) (Math.random() * 5);
            sum1 += arr1[i];
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\narr2: ");
        for (int i = 0; i < 5; i++) {
            arr2[i] = (int) (Math.random() * 5);
            sum2 += arr2[i];
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\nРез-т сравнения СА:");
        double ma1 = (double) sum1/5, ma2 = (double) sum2/5;
        if(ma1 == ma2){
            System.out.println("СА однинаковые и равны " + ma1);
        } else if (ma1 > ma2){
            System.out.println("СА arr1 больше и равно " + ma1);
        } else {
            System.out.println("СА arr2 больше и равно " + ma2);
        }
    }
}
