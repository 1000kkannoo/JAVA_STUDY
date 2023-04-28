package ch10;

public abstract class Car {

    public abstract void drive();

    public abstract void stop();

    public abstract void fuel();

    public void startCar() {
        System.out.println("시동을 켭니다");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다");
    }

    // {}를 통해 정의했기 때문에 해당 메서드는 오버라이딩에 여부와 상관없음
    public void washCar() {}

    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        fuel();
        washCar();
    }
}
