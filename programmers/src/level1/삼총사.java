package level1;

public class 삼총사 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-2, 3, 0, 2, -5}));
    }

    public static int solution(int[] n) {
        int cnt = 0;
        for (int i = 0; i < n.length - 2; i++) {
            for (int j = i + 1; j < n.length - 1; j++) {
                for (int k = j + 1; k < n.length; k++) {
                    cnt += (n[i] + n[j] + n[k] == 0) ? 1 : 0;
                }
            }
        }
        return cnt;
    }
}
