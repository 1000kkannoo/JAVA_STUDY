package main.level0;

public class 글자_이어_붙여_문자열_만들기 {
    public static void main(String[] args) {
        System.out.println(solution("zpiaz", new int[]{1, 2, 0, 0, 3}));
    }

    private static String solution(String my_string, int[] index_list) {
        String answer = "";
        for (int index : index_list) {
            answer += my_string.charAt(index);
        }
        return answer;
    }
}
