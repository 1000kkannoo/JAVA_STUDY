package study;

public class q1문자찾기 {
    public static void main(String[] args) {
        System.out.println(solution("Computercooler", 'c'));
    }

    public static int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char c : str.toCharArray()) {
            answer = (c == t) ? answer + 1 : answer;
        }

        /*
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                answer++;
            }
        }*/

        return answer;
    }
}
