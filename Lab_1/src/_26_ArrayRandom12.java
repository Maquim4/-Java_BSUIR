public class _26_ArrayRandom12 {
    public static void main(String[] args) {
        int[] arr;
        int maxNum = -15;
        int indexMax = 0;
        arr = new int[12];
        System.out.println("Массив:");
        for (int i = 0; i < 12; i++) {
            arr[i] = (int) (Math.random() * 31) -15;
            if(maxNum <= arr[i]){
                maxNum = arr[i];
                indexMax = i;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nМаксимальный элемент = " + maxNum + ". Его индекс = " + indexMax);
    }
}
