public class Home1_5 {
    public static void main(String[] args) {
        int a = -4;
        int b = -7;
        int c = -5;
        if (a > 0 & b > 0 & c > 0) {
            System.out.println("3");
        } else if (a > 0 & b < 0 & c > 0) {
            System.out.println("2 1");
        } else if (a > 0 & b > 0 & c < 0) {
            System.out.println("2 1");
        } else if (a < 0 & b > 0 & c > 0) {
            System.out.println("2 1");
        } else if (a > 0 & b < 0 & c < 0) {
            System.out.println("1 2");
        } else if (a < 0 & b > 0 & c < 0) {
            System.out.println("1 2");
        } else if (a < 0 & b < 0 & c > 0) {
            System.out.println("1 2");
        } else if (a < 0 & b < 0 & c < 0) {
            System.out.println("0 3");
        }
    }
}
