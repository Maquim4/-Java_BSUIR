import java.util.Scanner;

public class _31_UserInput {
    public static void main(String[] args) {
        int n = 0;
        int counterOfEven = 0;
        int[] arr;
        int[] arr2;

        while (n == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите натуральное число большее 3:");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n < 4) {
                    System.out.println("Вы ввели число меньше 3");
                    n = 0;
                }
            } else {
                System.out.println("Вы ввели не целое число");
                n = 0;
            }
        }

        System.out.println("Первый массив:");
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * n);
            if(arr[i] % 2 == 0 && arr[i] != 0){
                counterOfEven++;
            }
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nВторой массив:");
        if(counterOfEven == 0){
            System.out.print("В первом массиве нет чётных чисел");
        } else {
            arr2 = new int[counterOfEven];
            for (int i = 0 , b = 0; i < n; i++){
                if( arr[i] % 2 == 0 && arr[i] != 0){
                    arr2[b] = arr[i];
                    System.out.print(arr2[b] + " ");
                    b++;
                }
            }
        }
    }
}
