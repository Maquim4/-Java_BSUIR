import java.util.Scanner;

public class _2_TrueFalse {
    public static void main(String[] args) {
    System.out.println("1)Введите четырехзначное число n:");
    int n1 ;
    Scanner sc1 = new Scanner(System.in);
    if (sc1.hasNextInt()) {
    n1 = sc1.nextInt();
     if(Integer.toString(n1).length() != 4){
         System.out.println("Нам нужно 4х значное число");
     } else{
         int last2num = n1 % 100;
         int first2num = n1 / 100;
         int sumFirst = first2num / 10 + first2num % 10;
         int sumLast = last2num / 10 + last2num % 10;
         System.out.println("Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр");
         System.out.println(sumFirst == sumLast);
     }
    } else {
        System.out.println("Вы ввели не целое число число");
    }
    System.out.println("2)Введите трёхзначное число n:");
    int n2 ;
    Scanner sc2 = new Scanner(System.in);
    if (sc2.hasNextInt()) {
    n2 = sc2.nextInt();
    if (Integer.toString(n2).length() != 4) {
        System.out.println("Нам нужно 3х значное число");
    } else {
        int thirdNum = n2 % 10;
        int secondNum = n2 / 10 % 10;
        int firstNum = n2/ 100;
        int sum3 = thirdNum + secondNum + firstNum;
        System.out.println("Сумма цифр данного трехзначного числа N является четным числом.");
        System.out.println(sum3 % 2 == 0);
    }
    } else {
        System.out.println("Вы ввели не целое число число");
    }
    System.out.println("3)Введите число n:");
    Scanner sc3 = new Scanner(System.in);
    if (sc3.hasNextInt()) {
    int n3 = sc3.nextInt();
    System.out.println("Целое число N является четным двузначным числом.");
    System.out.println(n3 % 2 == 0 && String.valueOf(n3).length() == 2);
    } else {
        System.out.println("Вы ввели не целое число");
    }
    System.out.println("4)Введите целые числа a, b, c :");
    Scanner sc4 = new Scanner(System.in);
    if (sc4.hasNextInt()) {
    int a = sc4.nextInt();
        if (sc4.hasNextInt()) {
            int b = sc4.nextInt();
            if(sc4.hasNextInt()){
                int c = sc4.nextInt();
                System.out.println("Данная тройка натуральных чисел а, b, с является тройкой Пифагора, т.е. c 2 = a 2 + b 2 .");
                System.out.println(Math.pow(c,2) == Math.pow(a,2) + Math.pow(b,2));
            } else {
                System.out.println("Вы ввели не целое число");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }

    } else {
        System.out.println("Вы ввели не целое число");
    }
    System.out.println("5)Введите четырехзначное число n:");
    Scanner sc5 = new Scanner(System.in);
    if (sc5.hasNextInt()) {
    int n5 = sc5.nextInt();
    if(Integer.toString(n5).length() != 4){
        System.out.println("Нам нужно 4х значное число");
    } else{
        int num4th = n5 % 10;
        int num3d = n5 / 10 % 10;
        int num2nd = n5 / 100 % 10;
        int num1st = n5 / 1000;
        System.out.println("Все цифры данного четырехзначного числа N различны.");
        System.out.println(num4th != num3d &&
                num4th != num2nd &&
                num4th != num1st &&
                num2nd != num1st &&
                num2nd != num3d &&
                num3d != num1st);
    }
    } else {
        System.out.println("Вы ввели не целое число");
    }
    System.out.println("6)Введите четырехзначное число n:");
    Scanner sc6 = new Scanner(System.in);
    if (sc6.hasNextInt()){
    int n6 = sc6.nextInt();
    if(Integer.toString(n6).length() != 4){
        System.out.println("Нам нужно 4х значное число");
    } else{
        int num4th2 = n6 % 10;
        int num3d2 = n6 / 10 % 10;
        int num2nd2 = n6 / 100 % 10;
        int num1st2 = n6 / 1000;
        System.out.println("Данное четырехзначное число читается одинаково слева направо и справа налево.");
        System.out.println(num4th2 == num1st2 && num2nd2 == num3d2);
    }
    } else {
        System.out.println("Вы ввели не целое число");
    }

}
}
