import java.io.File;

public class Main2 {
    public static void main(String args[]) {
        File F = new File("C:/Users/user/Desktop/debug/src/Pack");
        String[] G = F.list();
        for (String path : G) {
            System.out.println(path);
        }
        System.out.println();
        for (int i = 0; i < G.length; i++) {
            if (G[i].endsWith("txt")) {
                System.out.println(G[i]);
            }
        }
    }
}
