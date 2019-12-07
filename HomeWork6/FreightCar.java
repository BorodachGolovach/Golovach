package HomeWork6;

public class FreightCar extends Ground {
    double carryingCapacityAuto;
    double fullCarryingCapacityAuto;

    FreightCar(int powerHorse, double powerKw, int maxSpeed, int weight, String mark,  int fullCarryingCapacityAuto) {
        this.fullCarryingCapacityAuto = fullCarryingCapacityAuto;
        super.mark = mark;
        super.maxSpeed = maxSpeed;
        super.powerHorse = powerHorse;
        super.powerKw = powerKw;
        super.weight = weight;
    }
    String printInfo() {
        return "Мощность в Л/С: " + powerHorse + "Мощьность в Кв: " + powerKw + "Максимальная скорость: " + maxSpeed + "Масса:" + weight + "Марка машины: " + mark +  "Грузоподъемность" + fullCarryingCapacityAuto;
    }
    void carryingCapacityAuto(double carryingCapacityAuto) {
        if (carryingCapacityAuto <= fullCarryingCapacityAuto && carryingCapacityAuto >= 0) {
            System.out.println("Грузовик загружен");
        } else if (carryingCapacityAuto > fullCarryingCapacityAuto && carryingCapacityAuto > 0) {
            System.out.println("Нужен грузовик побольше");
        }
    }
}
