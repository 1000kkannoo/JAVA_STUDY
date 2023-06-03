package main.level1;

public class 문자열내P와Y의개수 {
    public static void main(String[] args) {
        System.out.println(solution("asdkas"));
    }

    public static boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == 'p' || temp == 'P') {
                pCount++;
            }
            else if (temp == 'y' || temp == 'Y') {
                yCount++;
            }
        }
        return pCount == yCount || pCount + yCount == 0;
    }
}
