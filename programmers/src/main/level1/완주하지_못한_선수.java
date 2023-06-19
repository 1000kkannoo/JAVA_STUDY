package main.level1;

import java.util.HashMap;
import java.util.Scanner;

public class 완주하지_못한_선수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] participant = new String[n];
        for (int i = 0; i < n; i++) {
            participant[i] = sc.next();
        }

        String[] completion = new String[m];
        for (int i = 0; i < m; i++) {
            completion[i] = sc.next();
        }

        System.out.println(solution(participant, completion));
    }

    private static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> players = new HashMap<>();
        for (String name : participant) {
            players.put(name, players.getOrDefault(name, 0) + 1);
        }
        for (String name : completion) {
            if (!players.containsKey(name)) return name;
            else players.put(name, players.get(name) - 1);
        }

        for (String name : players.keySet()) {
            if (players.get(name) != 0) return name;
        }
        return answer;
    }
}
