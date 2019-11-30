import java.util.Scanner;

public class Home3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first massiv :");
        int j = scanner.nextInt();
        System.out.println("Input the second massiv :");
        int k = scanner.nextInt();
        int[] a = new int[j];
        int[] b = new int[k];
        double sSum1 = 0;
        double sSum2 = 0;
        for (int i = 0; i < j; i++) {
            a[i] = (int) (Math.random() * 15);
        }
        for (int i = 0; i < k; i++) {
            b[i] = (int) (Math.random() * 15);
        }
        System.out.print("Massiv 1  ");
        for (int i = 0; i < j; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nMassiv 2  ");
        for (int i = 0; i < k; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.print("\narithmetical mean Massiv 1  ");
        for (int i = 0; i < j; i++) {
            if (i < j) {
                sSum1 += a[i] / j;
            }
        }
        System.out.print(sSum1 + " ");

        System.out.print("\narithmetical mean Massiv 2  ");
        for (int i = 0; i < k; i++) {
            if (i < k) {
                sSum2 += b[i] / k;
            }
        }
        System.out.print(sSum2 + " ");
        System.out.println();
        if (sSum1 == sSum2) {
            System.out.println("arithmetical mean Massiv 1 = arithmetical mean Massiv 2");
        }
        if (sSum1 > sSum2) {
            System.out.println("arithmetical mean Massiv 1 > arithmetical mean Massiv 2");
        } else {
            System.out.println("arithmetical mean Massiv 1 < arithmetical mean Massiv 2");
        }
    }
}

