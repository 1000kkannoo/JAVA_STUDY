package main.level2;

import java.util.ArrayDeque;
import java.util.Deque;

public class 캐시 {
    public static void main(String[] args) {
        System.out.println(solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));
    }

    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Deque<String> cache = new ArrayDeque<>();
        for (String city : cities) {
            city = city.toLowerCase();
            if (cache.contains(city)) {
                answer += 1;
                cache.remove(city);
            } else {
                answer += 5;
                if (cacheSize > 0 && cache.size() >= cacheSize) cache.pollLast();
            }
            if (cacheSize > 0) cache.offerFirst(city);
        }
        return answer;
    }
}
