package week2;

public class CNGCar extends Car{
    @Override
    void start() {
        System.out.println("CNG car started");
    }

    @Override
    void stop() {
        System.out.println("CNG car stopped");
    }
}
