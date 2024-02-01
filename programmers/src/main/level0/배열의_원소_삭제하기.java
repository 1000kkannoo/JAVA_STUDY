package main.level0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 배열의_원소_삭제하기 {
    public static void main(String[] args) throws Exception {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};

        int[] answer = solution(arr, delete_list);
        for (int n : answer) {
            System.out.println(n);
        }
    }

    public static int[] solution(int[] arr, int[] deleteList) {
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int k : deleteList) {
                if (arr[i] == k) {
                    arr[i] = -1;
                    size++;
                    break;
                }
            }
        }

        int[] answer = new int[arr.length - size];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != -1) {
                    answer[i] = arr[j];
                    arr[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}
