package HomeWork6;

import com.sun.source.tree.UsesTree;

public class PassangerAuto extends Ground {
    String typeBodyAuto;
    int numberOfPassengers;
    double fuel = 1;

    PassangerAuto(int powerHorse, double powerKw, int maxSpeed, int weight, String mark, String typeBodyAuto, int numberOfPassengers, int numberOfWheels, double fuelConsumptionOnKm) {
        this.numberOfPassengers = numberOfPassengers;
        this.typeBodyAuto = typeBodyAuto;
        super.mark = mark;
        super.maxSpeed = maxSpeed;
        super.numberOfWheels = numberOfWheels;
        super.powerHorse = powerHorse;
        super.powerKw = powerKw;
        super.weight = weight;
        super.fuelConsumptionOnKm = fuelConsumptionOnKm;
    }

    String printInfo() {
        return "Мощность в Л/С: " + powerHorse + "Мощьность в Кв: " + powerKw + "Максимальная скорость: " + maxSpeed + "Масса:" + weight + "Марка машины: " + mark + "Тип кузова: " + typeBodyAuto + "Количество пассажиров: " + numberOfPassengers + "Топливо" + fuel +  "Расход топлива" + fuelConsumptionOnKm;
    }
    void maxDistanse(double time) {
        double distance = time * maxSpeed;
        System.out.println("За время " + time + " ч  " + "автомобиль " + mark + " двигаясь с максимальной скоростью " + maxSpeed + " км/ч  " + "проедет " + distance + " км  " + "израсходует " + fuel(distance) + "  литров топлива");
    }
    private double fuel(double distance) {
        return  fuel = fuelConsumptionOnKm *distance/100;
    }
}
