package main.level0;

import java.util.Stack;

public class 빈_배열_추가_삭제하기 {
    public static void main(String[] args) {
        int[] solution = solution(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false});
        for (int i : solution) {
            System.out.printf("%d ", i);
        }
    }

    public static int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            boolean b = flag[i];
            if (b) {
                int n = arr[i] * 2;
                for (int j = 0; j < n; j++) {
                    stack.push(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    stack.pop();
                }
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
