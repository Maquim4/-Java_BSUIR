import java.util.Scanner;

public class _29_CheckUserInput {
    public static void main(String[] args) {
        int num = 0;
        int sum1 = 0, sum2 = 0;
        int[] arr;
        while(num == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите чётное положительное число:");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num%2 != 0){
                    System.out.println("Вы ввели не чётное число");
                    num = 0;
                } else if( num<0 ){
                    System.out.println("Вы ввели отрицательное число");
                    num = 0;
                }
            } else {
                System.out.println("Вы ввели не целое число");
            }
        }
        arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = (int) (Math.random() * 11) - 5;
            if(i < num/2){
                sum1 += Math.abs(arr[i]);
            } else {
                sum2 += Math.abs(arr[i]);
            }
            System.out.print(arr[i] + " ");
        }
        if (sum1 > sum2){
            System.out.println("\nСумма модулей первой половины больше " + sum1 + " > " + sum2);
        } else if (sum2 > sum1){
            System.out.print("\nСумма модулей второй половины больше " + sum1 + " < " + sum2);
        } else {
            System.out.print("\nСуммы модулей половин одинаковы и равны " + sum1);
        }
    }
}
