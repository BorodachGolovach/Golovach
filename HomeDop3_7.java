import java.util.Scanner;

public class HomeDop3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        int j = scanner.nextInt();
        System.out.println("Значение:");
        int n = scanner.nextInt();
        int m = 0;
        int[] a = new int[j];
        for (int i = 0; i < j; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print(a[i] + "   ");
        }
        System.out.println();
        for (int i = 0; i < j; i++) {
            if (a[i] == n) {
                m++;
            }
        }
        System.out.print(m);
    }
}
