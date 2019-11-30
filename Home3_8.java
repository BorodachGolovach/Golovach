import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Home3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first massiv :");
        int j = scanner.nextInt();
        System.out.println("Input the second massiv :");
        int k = scanner.nextInt();
        int[] a = new int[j];
        int[] b = new int[k];
        double[] c = new double[10];
        int kol = 0;
        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            a[i] = rn.nextInt(j) + 1;
            b[i] = rn.nextInt(k) + 1;
            c[i] = (double) a[i] / b[i];
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] % 1 == 0) {
                kol++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println("the number of integer elements in the third massiv: " + kol);
    }
}


