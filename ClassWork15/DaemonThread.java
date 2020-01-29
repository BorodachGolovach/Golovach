public class DaemonThread extends Thread {
    DaemonThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < Math.pow(10, 10); i++) {
            if (i % 1 == 0) {
                System.out.println("I'm daemon");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started");
        double j = 3;
        DaemonThread thread = new DaemonThread("Bob");
        thread.setDaemon(true);
        thread.start();
        thread.sleep((long) (j * 1000));
        thread.interrupt();
        System.out.println("Main thread finished");

    }
}

