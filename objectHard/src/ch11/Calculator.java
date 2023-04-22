package ch11;

// implements는 여러개 선언 가능, 구현이 없어서 모호함이 없어서 가능함
public abstract class Calculator implements Calc{
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
