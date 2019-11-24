public class Home1_7 {
    public static void main(String[] args) {
        int i = 5;
        int j = i%100;
        if (j>11 && j<14) {
            System.out.println("программистов");
        } else {
            switch (i%10) {
                case 1:
                    System.out.println("програмист");
                    break;
                case 2: case 3: case 4:
                    System.out.println("программиста");
                    break;
                default:
                    System.out.println("программистов");
            }
        }
    }
}
