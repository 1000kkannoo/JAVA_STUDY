package ch06;

public class DoubleTest {
    public static void main(String[] args) {
        double dNum = 3.14;
        float fNum = 3.14F;

        System.out.println(dNum);
        System.out.println(fNum);

        // 부동소수점의 미세한 오차가 발생 (부동소수점의 오류)
        double myNum = 1;
        for (int i = 0; i < 10000; i++) {
            myNum = myNum + 0.1;
        }

        System.out.println(myNum);
    }
}
