package main.level1;

public class 평균구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
    }

    public static double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / (double) arr.length;

//        stream 은 속도 저하가 심하다
//        return Arrays.stream(arr).average().getAsDouble();
    }
}
