public class Home2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int r = 1;
        int c = 1;
        int b = 256;
        for (int a = c; a < b; a++) {
            if (c >= 256) {
                break;
            }
            c *= 2;
            System.out.println(c); // Проверка того что выводятся только нечетные числа
            sum += c;
        }
        System.out.print("The sum of all numbers ");
        System.out.println(sum + r);
    }
}

