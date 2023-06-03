package main.level0;

public class 배열의_유사도 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}));
    }

    private static int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String value : s2) {
            for (String s : s1) {
                if (s.equals(value)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
