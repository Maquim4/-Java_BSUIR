public class _33_Students {
    public static void main(String[] args){
        int [][] arr = new int[15][3];

        for (int i = 0; i < 15; i++){
            for (int j = 0; j < 3; j++){
                arr[i][j] = (int) (Math.random()*8)+2;
                if (j == 2){
                    arr[i][j] = arr[i][j-2] * arr[i][j-1];
                    for (int q = 0; q < i; q++){
                        if (arr[i][j] == arr[q][j] && i > 0){
                            if (arr[i][j-1] == arr[q][j-1] || arr[i][j-2] == arr[q][j-2]){
                                --i;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Примеры: ");
        for (int i = 0; i < 15; i++){
            for (int j = 0; j< 3; j++){
                if (j == 0){
                    System.out.print(arr[i][j] + " * ");
                }
                if (j == 1){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
