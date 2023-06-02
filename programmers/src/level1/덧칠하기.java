package level1;

public class 덧칠하기 {
    public static void main(String[] args) {
        System.out.println(solution(4, 1, new int[]{1, 2, 3, 4}));
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;

        boolean[] paint = extracted(n);

        for (int k : section) {
            int index = k - 1;

            if (paint[index] == false) {
                continue;
            }

            answer++;

            for (int j = index; j < n; j++) {
                if (j == index + m) {
                    break;
                }
                paint[j] = false;
            }
        }

        return answer;
    }

    private static boolean[] extracted(int n) {
        boolean[] paint = new boolean[n];

        for (int i = 0; i < n; i++) {
            paint[i] = true;
        }
        return paint;
    }
}
