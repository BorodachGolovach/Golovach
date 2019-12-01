import java.util.Scanner;

public class HomeDop3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        int j = scanner.nextInt();
        int[] a;
        a = new int[j];
        int sum = 0;
        double sumS = 0;
        for (int i = 0; i < j; i++) {
            a[i] = (int) ((Math.random() * 99)+1);
            System.out.print(a[i] + "  ");
        }
        System.out.println();
        System.out.print("\nНечетные элементы: ");
        for (int i = 0; i < j; i++) {
            if (a[i] % 2 == 1 ) {
                System.out.print(a[i] + " ");
                sum += a[i];
                sumS++;
            }
        }
        System.out.print("\nСреднее арифметическое: ");
        System.out.print(sum/sumS);
    }
}
