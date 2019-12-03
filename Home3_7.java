import java.util.Scanner;

public class Home3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        int j = scanner.nextInt();
        int[] a = new int[j];
        int max = 0;
        int w = 1;
        for (int i = 0; i < j; i++) {
            a[i] = (int) (Math.random() * 15);
            System.out.print(" " + a[i]);
        }
        System.out.println();
        for (int i = 0; i < j; i++) {
            if (max < a[i]) {
                max = a[i];
                w = i + 1;
            }
        }
        System.out.println("\nНомер максимального элемента в масcиве " + w);
        System.out.println("\nМаксимальный элемент в масcиве " + max);

    }
}


