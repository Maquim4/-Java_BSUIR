public class _32_TwoSizeArray {
    public static void main(String[] args) {
        int[][] arr;
        arr = new int[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Изначальный массив:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int k = 0; k < 6; k++) {
            for (int i = 0; i < 7; i++) {
                for (int j = i+1; j < 7; j++) {
                    if (arr[k][j] > arr[k][i]) {
                        int temp = arr[k][j];
                        arr[k][j] = arr[k][i];
                        arr[k][i] = temp;
                    }
                }
        }

        }
        System.out.println("Пеобразованный массив:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
