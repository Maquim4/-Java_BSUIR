public class _18_Army {
    public static void main(String[] args) {
        int amountOfDeleted = 0;
        for (int i = 1; i <= 99999 ; i++){
            String str = Integer.toString(i);
            if(str.contains("4") || str.contains("13")){
                System.out.println(str);
                amountOfDeleted++;
            }
        }
        System.out.println("Придётся исключить "+ amountOfDeleted + " номеров.");
    }
}
