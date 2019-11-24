public class Home2_3 {
    public static void main (String[] args) {
        int sum = 0;
        for (int a = 0; a < 257; a++)
            if (a % 2 == 0) {
                System.out.println(a); // Проверка того что выводятся только нечетные числа
                sum += a;
            }
        System.out.println("The number of all even numbers " + sum);
    }
}
