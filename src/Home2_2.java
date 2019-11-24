public class Home2_2 {
    public static void main (String[] args) {
        int bacterium = 1;
        int bacteriumall = 0;
        for (int i = 0; i < 24; i++)
            if (i % 3 == 0) {
                bacterium *= 2;
                System.out.println(bacterium);
                bacteriumall += bacterium;
            }
             System.out.println("The number of all bacteria in 24 hours " + bacteriumall);
    }
}
