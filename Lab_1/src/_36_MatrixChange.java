import java.util.Scanner;

public class _36_MatrixChange {
    public static void main(String[] args) {
        int size, num;
        int[][] m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер квадратной матрицы :");
        while (!sc.hasNextInt()) {
            System.out.println("Это не целое число");
            System.out.println("Введите размер матрицы:");
            sc.next();
        }
        size = sc.nextInt();
        size = Math.abs(size);

        System.out.println("Матрица:");
        m = new int [size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                m[i][j] = (int) (Math.random()*10);
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Введите номер строки для замены:");
        num = sc.nextInt();
        int[] max = m[0];
        int indexMax = 0;
        for (int i = 0, j = 0; i < size; j++, i++) {
            if (m[i][j] > max[j]){
                max = m[i];
                indexMax = i;
            }
        }
        int[] temp = m[num-1];
        m[num-1]=max;
        m[indexMax]=temp;
        System.out.println("Матрица:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
