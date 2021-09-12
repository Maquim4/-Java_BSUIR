import java.util.Scanner;

public class _34_SumAndPositive {
    public static void main(String[] args) {
        int size, sum = 0, counter = 0;
        int[][] m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы:");
        if (sc.hasNextInt()){
            size = sc.nextInt();
            if (size > 0){
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
                    for (int j = i + 1; j < size; j++) {
                        if (m[i][j] > 0) {
                            sum += m[i][j];
                            counter++;
                        }
                    }
                }
                System.out.println("Сумма = " + sum + " и число = " + counter + " положительных элементов матрицы");
            } else {
                System.out.println("Размер матрицы - натуральное число");
            }

        } else {
            System.out.println("Размер матрицы - натуральное число");
        }
    }
}
