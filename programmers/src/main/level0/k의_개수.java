package main.level0;

public class k의_개수 {
    public static void main(String[] args) {
        System.out.println(solution(10, 50, 5));
    }

    public static int solution(int i, int j, int k) {
        int answer = 0;
        String intStr = String.valueOf(k);
        for (int l = i; l <= j; l++) {
            String[] s = String.valueOf(l).split("");
            for (String splitStr : s) {
                if (splitStr.equals(intStr)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
