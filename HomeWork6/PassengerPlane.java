package HomeWork6;

public class PassengerPlane extends Air {
    int numberOfPassenger;
    int fullNumberOfPassenger;
    boolean bussnesClass;

    PassengerPlane(int wingspan,int minLeight, int fullNumberOfPassenger, boolean bussnesClass) {
        this.fullNumberOfPassenger = fullNumberOfPassenger;
        this.bussnesClass = bussnesClass;
        super.wingspan = wingspan;
        super.minLeight = minLeight;
    }

    String printInfo() {
        return "Размах крыльев" + wingspan + "Минимальная длина взлетной полосы" + minLeight + "Бизнес-класс" + bussnesClass + " Максимальное количество пассажиров" + fullNumberOfPassenger;
    }

    void numberOfPassenger(int numberOfPassenger) {
        if (numberOfPassenger <= fullNumberOfPassenger && numberOfPassenger >= 0) {
            System.out.println("Пассажиры сели в самолет ");
        } else if (numberOfPassenger > fullNumberOfPassenger && numberOfPassenger > 0) {
            System.out.println("В самолете не осталось мест ");
        }
    }
}
