package ru.skypro;

public class Bicycle extends TransportOnWheels {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        this.updateTyre();
    }
}