package level1;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {

    }

    public static int[] solution(long n) {
        String nums = String.valueOf(n);

        int[] answer = new int[nums.length()];
        int reverseNum = nums.length() - 1;

        for (int i = 0; i < nums.length(); i++) {
            answer[i] = nums.charAt(reverseNum) - '0';
            reverseNum--;
        }

        return answer;
    }
}
