public class _12_ShowSubsequence2num {
    public static void main(String[] args) {
        for (int i = -166; i < 100; i = 2 * i + 200) {
            if (String.valueOf(Math.abs(i)).length() == 2) {
                System.out.println(i);
            }
        }
    }
}
