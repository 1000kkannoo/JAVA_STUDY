package main.level0;

// 2022년 기준
public class 나이_출력 {
    public static void main(String[] args) {
        System.out.println(solution(23));
    }

    public static int solution(int age) {
        int year = 2022;
        return year - age + 1;
    }
}
