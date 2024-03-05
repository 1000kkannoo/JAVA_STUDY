package main.level0;

public class 잘라서_배열로_저장하기 {
    public static void main(String[] args) {
        String[] solution = solution("abc1Addfggg4556b", 6);
        for (String s : solution) {
            System.out.println(s);
        }
    }

    public static String[] solution(String my_str, int n) {
        int length = (my_str.length() % n == 0) ? my_str.length() / n : (my_str.length() / n) + 1;
        String[] answer = new String[length];

        for (int i = 0, j = 0; i < answer.length; i++, j += n) {
            if (my_str.length() - j < n) {
                answer[i] = my_str.substring(j);
            } else {
                answer[i] = my_str.substring(j, j + n);
            }
        }

        return answer;
    }
}
