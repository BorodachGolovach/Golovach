public class Home2_1 {
    public static void main (String[] args){
        double fday = 10;
        double sumkm = 0;
        for (double day = 0; day<6; day++) {
            sumkm = fday + sumkm;
            fday *= 1.1;
        }
        System.out.println(sumkm + fday);
    }
}
