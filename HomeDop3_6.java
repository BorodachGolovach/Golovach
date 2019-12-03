import java.util.Scanner;

public class HomeDop3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        int j = scanner.nextInt();
        int[] a = new int[j];
        for (int i = 0; i < j; i++) {
            a[i] = (int) (Math.random() * 20);
            System.out.print(a[i] + "   ");
        }
        System.out.println();
        for (int i = 0; i < j; i++) {
            for (int k = i + 1; k < j; k++) {
                if (a[k] == a[i]) {
                    System.out.print("\nВ массиве есть одинаковые числа ");
                }
            }
        }
    }
}
