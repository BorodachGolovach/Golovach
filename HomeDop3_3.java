import java.util.Scanner;

public class HomeDop3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        int j = scanner.nextInt();
        int[] a = new int[j];
        int sum = 0;
        double sumS = 0;
        int c = 4;
        for (int i = 0; i < j; i++) {
            a[i] = (int) ((Math.random() * 9) + 1);
            System.out.print(a[i] + "  ");
        }
        System.out.println();
        System.out.print("\nЭлементы массива превосходящие число С: ");
        for (int i = 0; i < j; i++) {
            if (a[i] > c) {
                System.out.print(a[i] + " ");
                sum += a[i];
                sumS++;
            }
        }
        System.out.print("\nСреднее арифметическое: ");
        System.out.print(sum / sumS);
    }
}
