package ch11;

// 모든 변수는 상수로 변환됨
// 모든 선언된 메서드는 추상 메서드
// 자바 8 이후부터 구현을 가지는 디폴트 메서드가 추가됨, default 키워드 사용
// 자바 8 이후부터 정적 메서드, 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드
// 자바 9 이후부터 private 메서드 구현 가능, 인터페이스 내부에서만 사용하기 위해 구현
public interface Calc {

    public static final double PI = 3.14;
    int Error = -9999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
}
