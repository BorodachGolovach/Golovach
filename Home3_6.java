import java.util.Scanner;

public class Home3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        int j = scanner.nextInt();
        int[] a;
        a = new int[j];
        boolean t = true;
        for (int i = 0; i < j; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print(a[i] + "  ");
        }
        System.out.println();
        for (int i = 1; i < j; i++) {
            if (a[i]<=a[i-1]) {
                t = false;
                break;
            }
        }
        if (t) {
            System.out.println("Массив возрастоющий");
        } else {
            System.out.println("Массив не возрастающий");
        }
    }
}
