// 나열된 수에서 최솟값과 최댓값 구하기
public class MinMax {

    public static void main(String[] args) {
        int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

        int min = numbers[0];
        int max = numbers[0];

        int minPos = 0;
        int maxPos = 0;

        for (int i = 1; i < numbers.length; i++){
            if (min > numbers[i]) {
                min = numbers[i];
                minPos = i;
            }

            if (max < numbers[i]) {
                max = numbers[i];
                maxPos = i;
            }
        }

        System.out.println("가장 큰 값 : " + max + " / 위치 : " + maxPos);
        System.out.println("가장 작은 값 : " + min + " / 위치 : " + minPos);
    }
}
