public class Home2_4 {
    public static void main (String[] args){
        int a = 2;
        int b = 3;
        int multiplied = 0;
        while (a != 0)
            if (a > 0){
               multiplied += b;
                a -= 1;
            }
            else{
                multiplied -= b;
                b += 1;
            }
        System.out.println("Answer: " + multiplied + "");
    }
}
