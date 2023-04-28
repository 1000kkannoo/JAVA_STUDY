package ch17;

public class BreakTest {

    public static void main(String[] args) {

        int sum = 0;
        int num;
        for (num = 1; ; num++) {
            sum += num;
            if (sum > 100) {
                break; // 해당 for 문을 완전히 종료
            }
        }
        System.out.println(sum);
        System.out.println(num);
    }
}
