import java.io.File;

public class Main {
    public  static void main  (String args []){
        String nameDir  = "C:/Users/user/Desktop/debug/src/java/prolang/bad";
        File a   = new File(nameDir);
        a.mkdirs();
    }
}
