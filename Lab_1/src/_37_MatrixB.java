import java.util.Scanner;

public class _37_MatrixB {
    public static void main(String[] args) {
        int columns, rows;
        int[][] m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        System.out.println("Введите столбцы:");
        while (!sc.hasNextInt()) {
            System.out.println("Это не целое число");
            System.out.println("Введите столбцы:");
            sc.next();
        }
        columns = sc.nextInt();
        columns = Math.abs(columns);

        System.out.println("Введите колонки:");
        while (!sc.hasNextInt()) {
            System.out.println("Это не целое число");
            System.out.println("Введите колонки:");
            sc.next();
        }
        rows = sc.nextInt();
        rows = Math.abs(rows);

        System.out.println("Матрица:");
        m = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                m[i][j] = (int) (Math.random() * 19) - 9;
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            int max = m[i][0];
            int indexMax = 0;
            int min = m[i][0];
            int indexMin = 0;
            for (int j = 0; j < columns; j++) {
                if (max <= m[i][j]){
                    max = m[i][j];
                    indexMax = j;
                }
                if (min >= m[i][j]){
                    min = m[i][j];
                    indexMin = j;
                }
            }
            int tempMax = m[i][indexMax];
            int tempMin = m[i][indexMin];
            m[i][indexMax] = m[i][0];
            m[i][0] = tempMax;
            m[i][indexMin] = m[i][columns-1];
            m[i][columns-1] = tempMin;
        }
        System.out.println("Матрица с заменой:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
