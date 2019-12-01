import java.util.Scanner;

public class HomeDop3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        int j = scanner.nextInt();
        int max = 0;
        int max2 = 0;
        int[] a = new int[j];
        for (int i = 0; i < j; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print(a[i] + "   ");
        }
        System.out.println();
        for (int i = 0; i < j; i++) {
            max = Math.max(max, a[i]);
        }
        for (int i = 0; i < j; i++) {
            if (a[i] < max && a[i] > max2)
                max2 = a[i];
        }
        System.out.println("Максимальное число массива " + max);
        System.out.println("Второе по величине максимальное число массива " + max2);
    }
}
