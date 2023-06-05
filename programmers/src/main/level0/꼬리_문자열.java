package main.level0;

public class 꼬리_문자열 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"abc", "def", "ghi"}, "ef"));
    }

    private static String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();
        for (String str : str_list) {
            answer = (str.contains(ex) == false) ? answer.append(str) : answer;
        }
        return answer.toString();
    }
}
