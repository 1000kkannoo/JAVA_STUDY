package ch10;

public class CarTest {

    public static void main(String[] args) {
        Car aiCar = new AICar();
        aiCar.run();

        Car manualCar = new ManualCar();
        manualCar.run();
    }
}
