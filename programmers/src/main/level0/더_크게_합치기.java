package main.level0;

public class 더_크게_합치기 {
    public static void main(String[] args) {
        System.out.println(solution(9, 91));
    }

    private static int solution(int a, int b) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int sum1 = Integer.parseInt(sb1.append(a).append(b).toString());
        int sum2 = Integer.parseInt(sb2.append(b).append(a).toString());

        return Math.max(sum1, sum2);
    }
}
