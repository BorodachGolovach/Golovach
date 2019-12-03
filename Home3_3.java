import java.util.Scanner;

public class Home3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        int j = scanner.nextInt();
        int[] a = new int[j];
        int sum = 0;
        for (int i = 0; i < j; i++) {
            a[i] = (int) ((Math.random() * 99) + 1);
            System.out.print(a[i] + "  ");
        }
        System.out.println();
        System.out.print("\nЧетные числа массива ");
        for (int i = 0; i < j; i++) {
            if ((a[i] % 2 == 0) && (a[i] != 0)) {
                System.out.print(a[i] + " ");
                sum++;
            }
        }
        System.out.print("\nКоличество четных чисел массива ");
        System.out.println(sum + "");
    }
}
