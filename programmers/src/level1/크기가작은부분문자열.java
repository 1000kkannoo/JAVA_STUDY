package level1;

public class 크기가작은부분문자열 {
    public static void main(String[] args) {
        System.out.println(solution("10203", "15"));
    }

    public static int solution(String t, String p) {
        int count = 0;
        long var = Long.parseLong(p);
        for (int i = 0; i <= t.length() - p.length(); i++) {
            long num = Long.parseLong(t.substring(i, i + p.length()));
            if (var >= num) {
                count++;
            }
        }
        return count;
    }
}
