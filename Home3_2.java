public class Home3_2 {
    public static void main(String[] args) {
        int[] a = new int[99];
        for (int j = 0, b = 0; b < a.length; a[j++] = ++b) {
        }
        System.out.print("Вывод элементов массива a в строку: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nВывод элементов массива a в строку в обратном порядке: ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}


