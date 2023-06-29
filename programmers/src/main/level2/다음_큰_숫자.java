package main.level2;

public class 다음_큰_숫자 {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    public static int solution(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567 ;
        }

        return arr[arr.length - 1];
    }
}
