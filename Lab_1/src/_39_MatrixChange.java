import java.util.Scanner;

public class _39_MatrixChange {
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
        m = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                m[i][j] = (int) (Math.random() * 19) - 9;
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Введите k-ый номер:");
        boolean correctInput = false;
        int k = 0;
        while (!correctInput){
            while (!sc.hasNextInt()) {
                System.out.println("Это не целое число");
                System.out.println("Введите k-ый номер:");
                sc.next();
            }
            k = sc.nextInt();

            if (k < 0 || k > rows || k > columns){
                System.out.println("k-ый номер должен быть в границах матрицы:");
            } else {
                correctInput = true;
            }
        }
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
