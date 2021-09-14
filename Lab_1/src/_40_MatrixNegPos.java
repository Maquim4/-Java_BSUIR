import java.util.Scanner;

public class _40_MatrixNegPos {
    public static void main(String[] args) {
        int size;
        int[][] m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы:");
        while (!sc.hasNextInt()) {
            System.out.println("Это не целое число");
            System.out.println("Введите размер матрицы:");
            sc.next();
        }
        size = sc.nextInt();

        System.out.println("Матрица:");
        m = new int [size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                m[i][j] = (int) (Math.random()*19)-9;
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++) {
                if (m[i][j] < 0) {
                    m[i][j] = 0;
                } else if (m[i][j] > 0){
                    m[i][j] = 1;
                }
            }
        }
        System.out.println("Матрица с заменой:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
