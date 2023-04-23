package ch17;

public class ContinueTest {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if ( i % 3 != 0) {
                continue; // continue 는 작업을 수행하지 않고 다음 반복으로 넘어감
            }
            System.out.println(i);
        }
    }
}
