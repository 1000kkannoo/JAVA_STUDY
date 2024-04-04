package main.level0;

import java.util.HashSet;
import java.util.Set;

public class 소수_찾기 {
    static Set<Integer> numberSet = new HashSet<>();

    public static void main(String[] args) {
        System.out.println(solution("011"));
    }

    public static int solution(String numbers) {
        DFS("", numbers);
        return (int) numberSet.stream().filter(num -> isPrime(num)).count();
    }

    private static void DFS(String prefix, String str) {
        int n = str.length();
        if (!prefix.equals("")) {
            numberSet.add(Integer.valueOf(prefix));
        }
        for (int i = 0; i < n; i++) {
            DFS(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
