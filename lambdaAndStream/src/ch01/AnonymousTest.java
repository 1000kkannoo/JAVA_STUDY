package ch01;

// 익명 내부 클래스
// 안드로이드의 이벤트 핸들러를 생각해보자
class AnonyOuter {
    static int sNum = 200;
    int outNum = 100;

    Runnable getRunnable(int i) {
        int localNum = 10;
        return new Runnable() {

            int localClassNum = 5;

            @Override
            public void run() {

                System.out.println("i =" + i);
                System.out.println("localNum = " + localNum);
                System.out.println("localClassNum = " + localClassNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
            }
        };
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable 이 구현된 익명 클래스 변수");
        }
    };
}
public class AnonymousTest {
    public static void main(String[] args) {
        AnonyOuter outer = new AnonyOuter();
        Runnable runnable = outer.getRunnable(20);
        runnable.run();
        outer.runnable.run();
    }
}
