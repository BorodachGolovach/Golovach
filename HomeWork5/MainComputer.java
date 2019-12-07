public class MainComputer {
    public static void main(String[] args) {
        Computer computer1 = new Computer("i9", 4, 200, 4);
        computer1.description();

        while (true) {
            System.out.println("Включаем компьютер");
            computer1.turningOn();
            System.out.println("Выключаем компьютер");
            computer1.switchedOff();
        }
    }
}
