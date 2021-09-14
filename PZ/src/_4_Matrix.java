import java.util.Scanner;

public class _4_Matrix {
    public static void main(String[] args) {
        int size = 0, num = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер квадратной матрицы :");
        boolean correctInput = false;
        while (!correctInput){
            System.out.println("Введите размер матрицы:");
            while (!sc.hasNextInt()) {
                System.out.println("Это не целое число");
                System.out.println("Введите размер матрицы:");
                sc.next();
            }
            size = sc.nextInt();
            if ( size <= 0 ){
                System.out.println("Размер матрицы должен быть > 0");
            } else {
                correctInput = true;
            }
        }

        int column = size , row = size;
        int[][] m = new int[size][size];
        int startRowIndex = 0, startColumnIndex = 0;

        while (startRowIndex < row && startColumnIndex < column) {
            for (int i = startColumnIndex; i < column; ++i) {
                m[startRowIndex][i] = num++;
            }

            startRowIndex++;

            for (int i = startRowIndex; i < row; ++i) {
                m[i][column - 1] = num++;
            }
            column--;

            if (startRowIndex < row) {
                for (int i = column - 1; i >= startColumnIndex; --i) {
                    m[row - 1][i] = num++;
                }
                row--;
            }

            if (startColumnIndex < column) {
                for (int i = row - 1; i >= startRowIndex; --i) {
                    m[i][startColumnIndex] = num++;
                }
                startColumnIndex++;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(String.valueOf(Math.abs(m[i][j])).length() == 1){
                    System.out.print(" " + m[i][j] + " ");
                } else {
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}
