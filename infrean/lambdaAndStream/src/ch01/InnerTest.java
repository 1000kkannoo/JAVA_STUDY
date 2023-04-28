package ch01;

class OutClass {

    private int num = 10;
    private static int sNum = 20;
    private InnerClass inClass;

    public OutClass() {
        inClass = new InnerClass();
    }
    // 인스턴스 이너클래스
    class InnerClass {
        int inNum = 100;
        // JAVA 16 이후부터 인스턴스 이너클래스 내부에
        // static 변수를 생성 할 수 있게 바뀜
        // static int sInNum = 200;

        void inTest() {
            System.out.println("OutClass num = " + num);
            System.out.println("OutClass sNum = " + sNum);
            System.out.println("InClass inNum = " + inNum);
        }

        /* JAVA 16 이후부터 가능
        static void sTest() {
            System.out.println(sInNum);
        }*/
    }

    public void usingInClass() {
        inClass.inTest();
    }

    // 정적 내부 클래스
    static class InStaticClass {
        int inNum = 500;
        static int sInNum = 700;

        void inTest() {
            // num += 10; // 외부 클래스의 인스턴스 변수는 사용할수 없음
            System.out.println("InStaticClass inNum = " + inNum);
            System.out.println("InStaticClass inNum = " + sInNum);
            System.out.println("OutStaticClass inNum = " + sNum);
        }

        static void sTest() {
            // num += 10; // 외부 클래스의 인스턴스 변수는 사용할 수 없음
            // inNum += 10; // 내부 클래스의 인스턴스 변수는 사용할 수 없음

            System.out.println("OutClass sNum = " + sNum);
            System.out.println("InStaticClass sInNum = " + sInNum);
        }
    }
}
public class InnerTest {

    public static void main(String[] args) {
/*        OutClass outer = new OutClass();
        outer.usingInClass();

        // JAVA 16 이후부터
        // System.out.println(OutClass.InnerClass.sInNum);
        // OutClass.InnerClass.sTest();

        // private 아닌 경우 생성
        OutClass.InnerClass innerClass = outer.new InnerClass();
        innerClass.inTest();*/

        OutClass.InStaticClass.sTest();
        OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();
        inStaticClass.inTest();
    }
}
