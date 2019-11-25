import java.util.Scanner;

public class Work3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input j :");
        int j = scanner.nextInt();
        System.out.println("Input k :");
        int k = scanner.nextInt();
        int[][] a;
        a = new int[j][k];
        for (int i = 0; i < j; i++,System.out.println() ) {
            for (int o = 0; o < k; o++) {
                a[i][o] = (int) (Math.random() * 100);
                System.out.print(a[i][o] + " ");
            }
        }
    }
}
