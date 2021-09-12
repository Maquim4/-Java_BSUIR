public class _19_RandomNumber {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 150) + 5;
        String no = 25 < num && num < 100 ?  " " :  " не ";
        System.out.println("Число " + num + no + "содержится в интервале (25,100)");
    }
}
