package week1;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(solution(33));
    }

    private static int solution(int number) {
        int[] arr = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            arr[i] = arr[i - 1] + count369(i);
        }

        return arr[number];
    }

    private static int count369(int target) {
        int count = 0;

        while (target > 0) {
            int digit = target % 10;
            if (digit == 3 || digit == 6 || digit == 9) {
                count++;
            }
            target /= 10;
        }

        return count;
    }

}
