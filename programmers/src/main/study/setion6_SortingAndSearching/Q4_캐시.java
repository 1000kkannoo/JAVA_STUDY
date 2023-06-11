package main.study.setion6_SortingAndSearching;

import java.util.Scanner;

public class Q4_캐시 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : solution(s, n, arr)) {
            System.out.print(num + " ");
        }
    }

    private static int[] solution(int s, int n, int[] arr) {
        int[] cache = new int[s];
        // 작업의 횟수
        for (int i = 0; i < n; i++) {
            int target = arr[i], j;
            boolean isPresent = false;
            // 캐시안의 메모리
            for (j = 0; j < s; j++) {
                if (cache[j] == target) {
                    isPresent = true;
                    break;
                }
            }

            // 캐시안의 메모리에 타겟이 존재할경우
            if (isPresent) {
                for (int k = j; k > 0; k--) {
                    cache[k] = cache[k - 1];
                }
            } else {
                // 캐시안의 메모리에 타겟이 없을 경우
                for (int k = s - 1; k > 0; k--) {
                    cache[k] = cache[k - 1];
                }
            }
            cache[0] = target;
        }
        return cache;
    }
}
