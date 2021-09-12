import java.util.Scanner;

public class _38_MatrixMagic {
    public static void main(String[] args) {
        int size;
        int[][] m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер квадратной матрицы :");
        size = sc.nextInt();

        System.out.println("Матрица:");
        m = new int [size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                m[i][j] = (int) (Math.random()*10);
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        boolean isMagicSquare = true;
        int[] sums = new int[size*2];

        int sumRow = 0, sumCol = 0, a = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sumRow += m[i][j];
                sumCol += m[j][i];
            }
            sums[a] = sumRow;
            sums[a + 1] = sumCol;
            sumRow = 0;
            sumCol = 0;
            a += 2;
        }
        for (int i = 1; i < size*2; i++)
        {
            if (sums[i] != sums[i - 1]) {
                isMagicSquare = false;
                break;
            }
        }
        System.out.println("\nMagic square: " + isMagicSquare );
    }
}
