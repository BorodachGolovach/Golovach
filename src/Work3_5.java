import java.util.Scanner;

public class Work3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input j :");
        int j = scanner.nextInt();
        System.out.println("Input k :");
        int k = scanner.nextInt();
        int[][] a;
        a = new int[j][k];
        int sum = 0;
        for (int i = 0; i < j; i++, System.out.println()) {
            for (int o = 0; o < k; o++) {
                a[i][o] = (int) (Math.random() * 100);
                System.out.print(a[i][o] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < j; i++) {
            for (int o = 0; o < k; o++) {
                if (i == o) {
                    sum += a[i][o];
                }
            }
        }
        System.out.println(sum);

    }

}



