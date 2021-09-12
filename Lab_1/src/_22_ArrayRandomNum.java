public class _22_ArrayRandomNum {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[8];
        System.out.println("Изначальный:");
        for (int i = 0; i < 8; i++) {
            arr[i] = (int) (Math.random() * 9) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nИзменённый:");
        for (int i = 0; i < 8; i++) {
            if(i % 2 != 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }

    }
}
