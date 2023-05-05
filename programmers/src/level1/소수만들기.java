package level1;


public class 소수만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 7, 6, 4}));
    }

    public static int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static Boolean isPrime(int sum) {
        boolean checkPrime = true;
        for (int i = 2; i <= (int) Math.sqrt(sum); i++) {
            if (sum % i == 0) {
                checkPrime = false;
                break;
            }
        }
        return checkPrime;
    }
}
