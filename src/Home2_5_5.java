public class Home2_5_5 {
    public static void main(String[] args) {
        int N = 21;
        double inch = 2.54;
        for (int i = 1; i < N; i++) {
            System.out.printf("%1$2.2f\t%2$2.2f\n", (double) i, i / inch);
                if (i == 2) {
                System.out.printf("%1$2.2f\t%2$2.2f\n", inch, 1.0);
            }
        }
    }
}
