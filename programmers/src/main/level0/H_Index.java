package main.level0;

import java.util.Arrays;

public class H_Index {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 0, 6, 1, 5}));

    }

    public static int solution(int[] citations) {
        Arrays.sort(citations);
        int length = citations.length;
        for (int i = 0; i < length; i++) {
            int h = length - i;
            if (citations[i] >= h) {
                return h;
            }
        }
        return 0;
    }
}
