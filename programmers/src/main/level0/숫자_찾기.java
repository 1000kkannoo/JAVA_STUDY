package main.level0;

public class 숫자_찾기 {
    public static void main(String[] args) {
        System.out.println(solution(29183, 1));
    }

    public static int solution(int num, int k) {
        String find = String.valueOf(k);
        String[] split = String.valueOf(num).split("");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(find)) {
                return i + 1;
            }
        }
        return -1;
    }
}
