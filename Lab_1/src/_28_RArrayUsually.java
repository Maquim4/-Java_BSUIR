public class _28_RArrayUsually {
    public static void main(String[] args) {
        int[] arr;
        int count0 = 0, count1 = 0, count_1 = 0;
        arr = new int[11];
        System.out.println("Массив:");
        for (int i = 0; i < 11; i++) {
            arr[i] = (int) (Math.random() * 3) - 1;
            switch (arr[i]) {
                case 0 -> count0++;
                case 1 -> count1++;
                case -1 -> count_1++;
                default -> System.out.print("Something went wrong");
            }
            System.out.print(arr[i] + " ");
        }
        if (count0 > count1 && count0 > count_1){
            System.out.println("\nВ массиве больше всего 0");
        }   else if (count1 > count0 && count1 > count_1){
            System.out.println("\nВ массиве больше всего 1");
        }   else if (count_1 > count0 && count_1 > count1){
            System.out.println("\nВ массиве больше всего -1");
        }
    }
}
