package ch10;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 핸들을 조작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("사람이 브레이크를 밟아 멈춥니다.");
    }

    @Override
    public void fuel() {
        System.out.println("차에 기름을 넣습니다.");
    }

    // 오버라이딩을 해도 되고 안해도 되는 메서드로 만듦
    @Override
    public void washCar() {
        System.out.println("손세차를 합니다.");
    }
}
