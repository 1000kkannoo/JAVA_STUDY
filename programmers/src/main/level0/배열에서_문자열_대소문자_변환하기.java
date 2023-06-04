package main.level0;

public class 배열에서_문자열_대소문자_변환하기 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"AAA","BBB","CCC","DDD"}));
    }

    private static String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = (i % 2 == 0) ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        }
        return strArr;
    }
}
