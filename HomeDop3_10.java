import java.util.Scanner;

public class HomeDop3_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        int j = scanner.nextInt();
        int max = 0;
        int iMax = 0;
        int[] a = new int[j];
        int t = a[0];
        for (int i = 0; i < j; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print(a[i] + "   ");
        }
        System.out.println();
        for (int i = 0; i < j; i++) {
            if (a[i] > max) {
                max = a[i];
                iMax = i;
            }
        }
        System.out.println("Максимальное число массива " + max);
        System.out.println("Номер максимального числа " + iMax);
        a[iMax] = a[0];
        a[0] = max;
        for (int i = 0; i < j; i++)
        System.out.print(a[i]+ "  ");
    }
}
