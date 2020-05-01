public class teste3 {

    static String s1 = "";

    public static void main(String args[]) {
        for (int i = 0; i < 5000; i++) {
            s1 = s1 + 1;
            System.out.println(i);
        }
    }
}