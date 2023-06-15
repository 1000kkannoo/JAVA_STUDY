package main.study.setion9_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Player implements Comparable<Player> {
    int height;
    int weight;

    public Player(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Player o) {
        return o.height - this.height;
    }
}

public class S9Q1_씨름선수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Player[] players = new Player[n];
        ArrayList<Player> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            Player player = new Player(height, weight);
            arr.add(player);
            players[i] = player;
        }


        System.out.println(solution(n, players));
        System.out.println(solution2(arr, n));
    }

    private static int solution2(ArrayList<Player> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for (Player player : arr) {
            if (player.weight > max) {
                max = player.weight;
                cnt++;
            }
        }
        return cnt;
    }

    private static int solution(int n, Player[] players) {
        int answer = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (players[i].height < players[j].height && players[i].weight < players[j].weight) {
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}
