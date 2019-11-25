import java.util.Scanner;

public class Work3_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        int j = scanner.nextInt();
        int[] a;
        a = new int [j];
        for ( int i = 0; i<j; i++){
           a [i] = (int) (Math.random () * 100);
            System.out.println(a[i]);
        }

    }
}
