package main.level0;

public class 문자열_바꿔서_찾기 {
    public static void main(String[] args) {
        System.out.println(solution("ABBAA", "AABB"));
    }

    private static int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for (char ch : myString.toCharArray()) {
            sb = (ch == 'A') ? sb.append('B') : sb.append('A');
        }
        return (sb.toString().contains(pat)) ? 1 : 0;
    }
}
