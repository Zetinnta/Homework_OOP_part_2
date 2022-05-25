package ru.skypro;

public class ServiceStation {
    public static void checkTransport(TransportOnWheels transportOnWheels) {
        if (transportOnWheels != null) {
            System.out.println("Обслуживаем " + transportOnWheels.getModelName());
            transportOnWheels.check();
        }
    }
}
