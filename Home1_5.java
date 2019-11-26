public class Home1_5 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
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
        } else if (a > 0 & b == 0 & c > 0) {
            System.out.println("2 0");
        } else if (a > 0 & b > 0 & c == 0) {
            System.out.println("2 0");
        } else if (a == 0 & b > 0 & c > 0) {
            System.out.println("2 0");
        } else if (a > 0 & b == 0 & c == 0) {
            System.out.println("1 0");
        } else if (a == 0 & b > 0 & c == 0) {
            System.out.println("1 0");
        } else if (a == 0 & b == 0 & c > 0) {
            System.out.println("1 0");
        } else if (a == 0 & b == 0 & c == 0) {
            System.out.println("0 0");
        } else if (a == 0 & b < 0 & c == 0) {
            System.out.println("0 1");
        } else if (a == 0 & b == 0 & c < 0) {
            System.out.println("0 1");
        } else if (a < 0 & b == 0 & c == 0) {
            System.out.println("0 1");
        } else if (a == 0 & b < 0 & c < 0) {
            System.out.println("0 2");
        } else if (a < 0 & b == 0 & c < 0) {
            System.out.println("0 2");
        } else if (a < 0 & b < 0 & c == 0) {
            System.out.println("0 2");
        } else if (a == 0 & b < 0 & c > 0) {
            System.out.println("1 1");
        } else if (a > 0 & b == 0 & c < 0) {
            System.out.println("1 1");
        } else if (a < 0 & b > 0 & c == 0) {
            System.out.println("1 1");
        } else if (a == 0 & b > 0 & c < 0) {
            System.out.println("1 1");
        } else if (a < 0 & b == 0 & c > 0) {
            System.out.println("1 1");
        } else if (a > 0 & b < 0 & c == 0) {
            System.out.println("1 1");
        }
    }
}
