import java.util.Scanner;

public class _39_MatrixChange {
    public static void main(String[] args) {
        int columns, rows;
        int[][] m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы (столбцы, колонки):");
        columns = sc.nextInt();
        rows = sc.nextInt();

        System.out.println("Матрица:");
        m = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                m[i][j] = (int) (Math.random() * 19) - 9;
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Введите k-ый номер:");
        int k = sc.nextInt();

        int max = Math.abs(m[0][0]);
        int indexColumn = 0, indexRow = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (max <= Math.abs(m[i][j])){
                    max = Math.abs(m[i][j]);
                    indexRow = i;
                    indexColumn = j;
                }
            }
        }

        int[] tempRow = m[indexRow];
        m[indexRow] = m[k-1];
        m[k-1] = tempRow;
        for(int i = 0; i < rows; i++){
            int tempColumnsEl = m[i][indexColumn];
            m[i][indexColumn] = m[i][k-1];
            m[i][k-1] = tempColumnsEl;
        }
        System.out.println("Максимальный элемент:" + max);
        System.out.println("Матрица с заменой:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
