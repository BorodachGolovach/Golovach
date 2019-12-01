import java.util.Scanner;

public class HomeDop3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        int j = scanner.nextInt();
        int min = 10;
        int[] a = new int[j];
        for (int i = 0; i < j; i++) {
            a[i] = (int) (Math.random() * 9) + 1;
            System.out.print(a[i] + "   ");
        }
        System.out.println();
        for (int i = 1; i < j; i++) {
            if (a[i] % 2 == 0){
                System.out.print(a[i]+ " ");
                min = Math.min(min, a[i]);
            }
        }
        System.out.println("\nМинимальное число четного массива " + min);
    }
}
