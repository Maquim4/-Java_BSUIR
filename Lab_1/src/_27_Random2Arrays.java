public class _27_Random2Arrays {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        double[] arr3;
        arr1 = new int[10];
        arr2 = new int[10];
        arr3 = new double[10];
        int amountOfInteger = 0;

        System.out.println("Изначальные:");
        System.out.println("arr1: ");
        for (int i = 0; i < 10; i++) {
            arr1[i] = (int) (Math.random() * 8) + 1;
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\narr2: ");
        for (int i = 0; i < 10; i++) {
            arr2[i] = (int) (Math.random() * 8) + 1;
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\narr3: ");
        for (int i = 0; i < 10; i++) {
            arr3[i] = (double) arr1[i]/arr2[i];
            if(arr3[i]%1 == 0){
                amountOfInteger++;
            }
            System.out.print(arr3[i] + " ");
        }
        System.out.println("\nКол-во целых чисел в arr3 равно " + amountOfInteger);

    }
}
