public class Home2_5_5 {
    public static void main(String[] args) {
        int n = 21;
        double inch = 2.54;
        for (int i = 1; i < n; i++) {
            System.out.printf( "%d inch = %3.2f centimeters\n", i, i * inch);
        }
    }
}
