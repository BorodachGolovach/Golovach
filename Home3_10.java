import java.util.Arrays;
import java.util.Scanner;

public class Home3_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        int j = scanner.nextInt();
        if (j <= 3) {
            System.out.println("Введено не правильное число ");
        } else {
            int n = j;
            int[] a = new int[n];
            int sumF = 0;
            int sumS = 0;
            for (int i = 0; i < n; i++) {
                a[i] = (int) (Math.random() * n);
                System.out.print(a[i] + "  ");
            }
            System.out.println();
            System.out.print("\nМассив из четных чисел первого: ");
            int[] b = Arrays.copyOfRange(a, 0, a.length);
            for (int i = 0; i < n; i++) {
                if ((b[i] % 2 == 0) && (b[i] != 0)) {
                    System.out.print(b[i] + " ");
                }
            }
        }
    }
}
