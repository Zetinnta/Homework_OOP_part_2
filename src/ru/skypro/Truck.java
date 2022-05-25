package ru.skypro;

public class Truck extends TransportOnWheels {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        this.updateTyre();
        this.checkEngine();
        this.checkTrailer();
    }
}
