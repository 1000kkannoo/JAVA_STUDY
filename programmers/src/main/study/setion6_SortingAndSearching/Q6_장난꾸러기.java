package main.study.setion6_SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_장난꾸러기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : solution(n, arr)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(int n, int[] arr) {
        int[] answer = new int[2];
        int[] sortArray = arr.clone();
        Arrays.sort(sortArray);

        for (int i = 0, j = 0; i < n; i++) {
            if (arr[i] != sortArray[i]) {
                answer[j] = i + 1;
                j++;
            }
        }

        return answer;
    }
}
