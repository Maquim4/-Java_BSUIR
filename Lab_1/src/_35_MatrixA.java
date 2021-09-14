import java.util.Scanner;

public class _35_MatrixA {
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

        System.out.println("Введите колонки:");
        while (!sc.hasNextInt()) {
            System.out.println("Это не целое число");
            System.out.println("Введите колонки:");
            sc.next();
        }
        rows = sc.nextInt();

        System.out.println("Матрица:");
        m = new int [rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                m[i][j] = (int) (Math.random()*10);
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        int amountOfUniq = 0;
        for (int i = 0; i < columns; i++) {
            int sum = 0;
            for (int j=0; j < rows; j++)
            {
                sum += m[j][i];
            }
            for ( int a=0; a < rows; a++)
            {
                if(m[a][i]>sum-m[a][i]) amountOfUniq++;
            }
        }
        System.out.println("Кол-во особых элементов:" + amountOfUniq);
    }
}
