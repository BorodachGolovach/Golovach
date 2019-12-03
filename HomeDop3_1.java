import java.util.Scanner;

public class HomeDop3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        int j = scanner.nextInt();
        int[] a = new int[j];
        int sum = 1;
        for (int i = 0; i < j; i++) {
            a[i] = (int) ((Math.random() * 99) + 1);
            System.out.print(a[i] + "  ");
        }
        System.out.println();
        System.out.print("\nЧисла кратные 3: ");
        for (int i = 0; i < j; i++) {
            if (a[i] % 3 == 0) {
                System.out.print(a[i] + " ");
                sum *= a[i];
            }
        }
        System.out.print("\nПроизведение чисел кратных 3: ");
        System.out.print(sum);
    }
}
