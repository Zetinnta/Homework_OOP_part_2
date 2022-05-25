package ru.skypro;

public class Car extends TransportOnWheels {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check() {
        this.updateTyre();
        this.checkEngine();
    }

}
