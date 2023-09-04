package week1;

public class Problem5 {
    public static void main(String[] args) {
        for (int answer : solution(15000)) {
            System.out.print(answer + " ");
        }
    }

    private static int[] solution(int money) {
        int[] types = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int[] result = new int[types.length]; // 화폐 단위의 갯수를 저장할 배열

        for (int i = 0; i < types.length; i++) {
            result[i] = money / types[i];
            money %= types[i];
        }

        return result;
    }
}
