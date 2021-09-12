import java.util.Random;

public class _30_RandomWithLogic {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[12];
        System.out.println("Массив:");
        for (int i = 0; i < 12; i++) {
            if(i < 6){
                arr[i] = (int) (Math.random() * 9) - 10;
            } else {
                arr[i] = (int) (Math.random() * 9) + 1;
            }
        }
        Random r = new Random();
        for (int i = 0; i < 12; i++) {
            int randomIndex = r.nextInt(12);
            int temp = arr[randomIndex];
            arr[randomIndex] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < 12; i++) {
            System.out.print( arr[i] + " ");
        }
    }
}
