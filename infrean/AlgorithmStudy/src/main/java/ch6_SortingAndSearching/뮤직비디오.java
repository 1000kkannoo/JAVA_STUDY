package ch6_SortingAndSearching;

import java.util.Scanner;

public class 뮤직비디오 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] songs = new int[N];

        int left = 0, right = 0;
        for (int i = 0; i < N; i++) {
            songs[i] = sc.nextInt();
            left = Math.max(left, songs[i]);
            right += songs[i];
        }

        int result = right;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (countDVDs(songs, mid) <= M) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(result);
        sc.close();
    }

    // 주어진 DVD 크기로 필요한 DVD 수를 계산하는 함수
    public static int countDVDs(int[] songs, int capacity) {
        int count = 1;
        int tempSum = 0;
        for (int song : songs) {
            if (tempSum + song > capacity) {
                count++;
                tempSum = song;
            } else {
                tempSum += song;
            }
        }
        return count;
    }
}
