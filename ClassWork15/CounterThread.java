public class CounterThread extends Thread {
    CounterThread(String name){
        super(name);
    }
    public void run() {
        for (int i = 0; i < Math.pow(10, 10); i++) {

            if (i % 1000 == 0) {
                if (interrupted()) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started");
        double j = 0.1;
        CounterThread thread =  new CounterThread("Bob");
        thread.start();
        thread.sleep((long) (j*1000));
        thread.interrupt();
        System.out.println("Main thread finished");

    }


}

