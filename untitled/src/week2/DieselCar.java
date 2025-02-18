package week2;

public class DieselCar extends Car{


    @Override
    void start() {
        System.out.println("Diesel car started");
    }

    @Override
    void stop() {
        System.out.println("Diesel car stopped");
    }
}
