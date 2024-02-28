package main.level0;

public class qr_code {
    public static void main(String[] args) {
        System.out.println(solution(3, 1, "qjnwezgrpirldywt"));
    }

    public static String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < code.length(); i++) {
            count++;
            sb.append(code.charAt(i));
            if (count % q == 0) {
                sb.append(" ");
            }
        }

        String[] split = sb.toString().split(" ");
        sb.setLength(0);

        for (String s : split) {
            if (s.length() > r) {
                sb.append(s.charAt(r));
            }
        }

        return sb.toString();
    }
}
