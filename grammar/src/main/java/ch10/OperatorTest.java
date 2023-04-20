package ch10;

public class OperatorTest {

    public static void main(String[] args) {
        int total = 10;
        int add = 20;

        // 복합대입연산자
        total += add;
        System.out.println(total);

        int gameScore = 100;
        int myScore;

        myScore = ++gameScore; // 101, 101
        System.out.println(myScore + "," + gameScore);

        myScore = gameScore++; // 101, 102
        System.out.println(myScore + "," + gameScore);
    }
}
