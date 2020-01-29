public class HelloThread extends Thread {
    HelloThread(String name, int id) {
        super(name);
    }

    public void run() {
        Thread t = new Thread();
        System.out.println("Hello, I am thread with ID  " + Thread.currentThread().getId());

    }


    public static void main(String[] args) {
        System.out.println("Main thread started");
        new HelloThread("Jonh", 1).start();
        for (int i = 0; i < 9; i++) {
            new HelloThread("Tom", 10).start();
        }
        System.out.println("Main thread finished");


    }
}
