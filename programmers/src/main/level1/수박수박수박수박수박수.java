package main.level1;

public class 수박수박수박수박수박수 {

    public static void main(String[] args) {
        System.out.println(solution(4));
    }

    public static String solution(int n) {
        StringBuilder waterMelon = new StringBuilder();
        for (int i = 0; i < n; i++) {
            waterMelon = (i % 2 == 0) ? waterMelon.append("수") : waterMelon.append("박");
        }
        return waterMelon.substring(0);
    }
}
