package HomeWork6;

public class Main {
    public static void main(String[] args) {
        PassangerAuto passangerAuto = new PassangerAuto ( 300, 22, 120, 2000, "BMW", "Sedan", 2, 4, 10);
        passangerAuto.maxDistanse( 2);
        FreightCar freightCar = new FreightCar(500, 22, 100, 10000, "MAZ",  50);
        freightCar.carryingCapacityAuto(50);
        PassengerPlane passengerPlane = new PassengerPlane(22, 2000, 50, true);
        passengerPlane.numberOfPassenger(50);

    }
}
