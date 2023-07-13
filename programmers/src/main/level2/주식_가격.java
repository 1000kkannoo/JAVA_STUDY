package main.level2;

public class 주식_가격 {
    public static void main(String[] args) {
        for (int num : solution(new int[]{1, 2, 3, 2, 3})) {
            System.out.print(num + " ");
        }
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < answer.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                count++;
                if (prices[i] > prices[j]) break;
            }
            answer[i] = count;
        }

        return answer;
    }
}
