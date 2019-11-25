import java.util.Scanner;

public class Work3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        int j = scanner.nextInt();
        int[] a;
        a = new int[j];
        int min = 0;
        int max = 0;
        for (int i = 0; i < j; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(" " + a[i]);
        }
        System.out.println();
        for (int i = 0; i < j; i++) {
            if (max < a[i]) {
                max = a[i];
                System.out.println(max);
            }

        }

    }
}
