import java.util.Arrays;
import java.util.Scanner;

public class HomeDop3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        int j = scanner.nextInt();
        int[] a;
        a = new int[j];
        int min = a[0];
        for (int i = 0; i < j; i++) {
            a[i] = (int) ((Math.random() * 99) + 1);
            System.out.print(a[i] + "  ");
        }
        System.out.println();
        System.out.print("\nНечетные элементы: ");
        for (int i = 1; i < j; i++) {
            if (a[i] % 2 == 1) {
                System.out.print(a[i] + " ");
                min = Math.min(min, a[i]);
                System.out.print("\nНаименьший нечетный элемент " + min);
                }
            }
        }

    }

