package ch8_그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Player {
    private int height;
    private int weight;

    public Player(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}

public class 씨름_선수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int maxW = 0;
        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            int height = Integer.parseInt(split[0]);
            int weight = Integer.parseInt(split[1]);
            players[i] = new Player(height, weight);
        }

        Arrays.sort(players, Comparator.comparingInt(Player::getHeight));
        int count = 0;
        maxW = players[n - 1].getWeight();
        for (int i = n - 1; i >= 0; i--) {
            if (players[i].getWeight() >= maxW) {
                count++;
                maxW = players[i].getWeight();
            }
        }

        System.out.println(count);
    }
}
