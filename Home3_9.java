import java.util.Arrays;
import java.util.Scanner;

public class Home3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        int j = scanner.nextInt();
        if (j <= 0) {
            System.out.println("Введено не правильное число ");
        } else {
            int[] a = new int[j];
            int sumF = 0;
            int sumS = 0;
            for (int i = 0; i < j; i++) {
                a[i] = (int) (Math.random() * 16);
                System.out.print(a[i] + "  ");
            }
            System.out.println();
            int[] b = Arrays.copyOfRange(a, 0, a.length / 2);
            int[] w = Arrays.copyOfRange(a, a.length / 2, a.length);
            System.out.print("\nПервая половина массива: " + Arrays.toString(b));
            System.out.print("\nВторая половина массива: " + Arrays.toString(w));
            for (int i = 0; i < j/2; i++) {
                sumF += b[i];
            }
            for (int i = 0; i <= j/2; i++) {
                sumS += w[i];
            }
            System.out.println();
            System.out.println(sumF + " ");
            System.out.println(sumS + " ");
            if (sumF > sumS) {
                System.out.println("sum Massiv 1 > sum Massiv 2");
            } else {
                System.out.println("sum Massiv 1 < sum Massiv 2");
            }
            if (sumF == sumS) {
                System.out.println("sum Massiv 1 = sum Massiv 2");
            }
        }
    }
}
