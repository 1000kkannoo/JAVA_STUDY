package main.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Orange implements Comparable<Orange> {
    int size;
    int count;

    public Orange(int size, int count) {
        this.size = size;
        this.count = count;
    }

    @Override
    public int compareTo(Orange o) {
        return this.count - o.count;
    }
}

public class 귤_고르기 {
    public static void main(String[] args) {
        System.out.println(solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
    }

    public static int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }

        ArrayList<Orange> arr = new ArrayList<>();

        for (int key : map.keySet()) {
            int count = map.get(key);
            arr.add(new Orange(key, count));
        }

        Collections.sort(arr, Collections.reverseOrder());

        int sum = 0;
        int count = 0;

        for (Orange orange : arr) {
            sum += orange.count;
            count++;
            if (sum >= k) break;
        }

        return count;
    }
}
