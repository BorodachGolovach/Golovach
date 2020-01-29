public class SleeperThread extends Thread {
    SleeperThread(String name) {
        super(name);
       }

    public void run() {

        try {
            Thread.sleep(5000);
            System.out.println("Good morning! I'm awake.");
        } catch (InterruptedException e) {
            System.out.println("Damn, neighbors, again. I'm awake");
        }

    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started");
        int i = (int) (Math.random()*10);
        System.out.println(i);
        SleeperThread thread =  new SleeperThread("Bob");
        thread.start();
        thread.sleep(1000*i);
        interrupted();
        System.out.println("Main thread finished");

    }
}
