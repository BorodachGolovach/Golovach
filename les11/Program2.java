import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Program2 {
    public static void main (String[] args) {
        try (ObjectInputStream o1s = new ObjectInputStream(new FileInputStream("C:/Users/user/Desktop/debug/src/Pack3/dog.txt"))){
            Program.Dog p = (Program.Dog)o1s.readObject();
            System.out.println(p.getName()+ " " + p.getAge());
        } catch (Exception  ex){
            System.out.println(ex.getMessage());
        }
    }
}
