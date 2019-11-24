public class Home2_8 {
    public static void main (String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--) {
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
