public class _24_RArray4 {
    public static void main(String[] args) {
        int[] arr;
        boolean isGoUp = true;
        arr = new int[4];
        System.out.println("Массив:");
        for (int i = 0; i < 4; i++) {
            arr[i] = (int) (Math.random() * 89) + 10;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nЯвляется ли массив строго возрастающей последовательностью?");
        for (int i = 1; i < 4; i++) {
            if(arr[i-1]>=arr[i]){
                isGoUp = false;
                break;
            }
        }
        System.out.println("Ответ: " + isGoUp);
    }
}
