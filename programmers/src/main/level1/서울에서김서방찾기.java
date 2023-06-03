package main.level1;

public class 서울에서김서방찾기 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "a", "Kim"}));
    }

    public static String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";
            }
        }
        return "";
//        return "김서방은 " + IntStream.range(0, seoul.length).filter(i -> seoul[i].equals("Kim")).findFirst().orElse(0) + "에 있다";
    }
}
