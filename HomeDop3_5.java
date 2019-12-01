import java.util.Scanner;

public class HomeDop3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        int j = scanner.nextInt();
        int[] a;
        a = new int[j];
        for (int i = 0; i < j; i++) {
            a[i] = (int) (Math.random() * 20);
            System.out.print(a[i] + "   ");
        }
        System.out.println();
        for (int i = 0; i < j; i++) {
            if (i%2==1) {
                a[i] = 0;
            }
            System.out.print(a[i] + "   ");
        }
    }
}