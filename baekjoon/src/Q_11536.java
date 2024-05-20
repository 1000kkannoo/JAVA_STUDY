public class Q_11536 {
    public static void main(String[] args) {
        boolean[] isNotSelfNumber = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int dn = solution(i);
            if (dn < 10001) isNotSelfNumber[dn] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            if (!isNotSelfNumber[i]) sb.append(i).append("\n");
        }

        System.out.println(sb);
    }

    private static int solution(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
