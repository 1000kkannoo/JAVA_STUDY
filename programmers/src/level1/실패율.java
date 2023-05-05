package level1;

public class 실패율 {

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}));
    }

    public static int[] solution(int n, int[] stages) {
        int stage = stages.length;
        int[] answer = new int[n];
        double[] stageFailureRate = new double[n + 1];
        int[] numArray = new int[n + 1];

        // 정렬할 Array를 생성
        for (int i = 1; i <= n; i++) {
            numArray[i] = i;
        }

        // 1번부터 N번까지의 실패확률을 array에 담음
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int k : stages) {
                count += (i == k) ? 1 : 0;
            }
            stageFailureRate[i] = (double) count / (stage);
            stage -= count;
        }

        // 높은순으로 버블정렬을 numArray(인덱스값)과 같이 해줌
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n - i; j++) {
                if (stageFailureRate[j] < stageFailureRate[j + 1]) {
                    double temp = stageFailureRate[j];
                    stageFailureRate[j] = stageFailureRate[j + 1];
                    stageFailureRate[j + 1] = temp;

                    int numTemp = numArray[j];
                    numArray[j] = numArray[j + 1];
                    numArray[j + 1] = numTemp;
                }
            }
        }

        // 1번부터 5번까지 array를 0~4번에 담음
        System.arraycopy(numArray, 1, answer, 0, n);
        return answer;
    }
}
