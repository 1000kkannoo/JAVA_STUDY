package main.level0;

public class 배열_원소의_길이 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"We","are","Groot"} ));
    }

    private static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
