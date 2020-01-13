import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Program {
    public static void main(String[] args) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:/Users/user/Desktop/debug/src/Pack3/dog.txt"))) {
            Dog p = new Dog ("Boy", 2, 4, true);
            os.writeObject(p);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static class Dog implements Serializable {
       public String name;
        public int age;
        public int leg;
        public  transient boolean goodBoy;

        public Dog(String name, int age, int leg, boolean goodBoy) {
            this.name = name;
            this.age = age;
            this.leg = leg;
            this.goodBoy = goodBoy;
        }


        public String getName();
        }

        public int getAge() {
        }
    }
}

