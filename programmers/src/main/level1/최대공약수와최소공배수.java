package main.level1;

import java.util.Arrays;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        System.out.println(solution(3,12));
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int tempN = n;
        int tempM = m;
        while (m != 0){
            int r = n % m;
            n = m;
            m = r;
        }
        answer[0] = n;
        answer[1] = tempN / n * tempM;
        return answer;
    }
}
