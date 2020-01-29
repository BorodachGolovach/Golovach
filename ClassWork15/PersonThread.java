public class PersonThread extends Thread {
    PersonThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < Math.pow(10, 10); i++) {
            if (i % 1 == 0) {
                System.out.println("I'm daemon");
            }
        }
    }
}

