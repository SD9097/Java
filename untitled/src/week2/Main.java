package week2;

public class Main {

    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();
        car.start();

        DieselCar car2 = new DieselCar();
        car2.start();

        CNGCar car3 = new CNGCar();
        car3.start();
    }

}
