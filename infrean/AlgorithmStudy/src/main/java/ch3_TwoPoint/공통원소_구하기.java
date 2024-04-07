package ch3_TwoPoint;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 공통원소_구하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arrN = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int m = Integer.parseInt(br.readLine());
        int[] arrM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(arrN, arrM));
    }

    private static String solution(int[] arrN, int[] arrM) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for (int num : arrN) {
            for (int i : arrM) {
                if (num == i) {
                    list.add(num);
                    break;
                }
            }
        }

        list.sort(Comparator.naturalOrder());
        for (Integer integer : list) {
            sb.append(integer).append(" ");
        }

        return sb.toString();
    }
}
