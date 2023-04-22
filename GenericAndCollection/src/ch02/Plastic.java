package ch02;

public class Plastic extends Material{

    @Override
    public String toString() {
        return "재료는 plastic 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("Plastice 재료로 출력합니다.");
    }
}
