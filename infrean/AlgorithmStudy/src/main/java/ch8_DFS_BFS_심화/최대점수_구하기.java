package ch8_DFS_BFS_심화;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Question {
    private int score;
    private int time;

    public Question(int score, int time) {
        this.score = score;
        this.time = time;
    }

    public int getScore() {
        return score;
    }

    public int getTime() {
        return time;
    }
}

public class 최대점수_구하기 {
    static int n, m, max = Integer.MIN_VALUE;
    static Question[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);

        arr = new Question[n];
        for (int i = 0; i < arr.length; i++) {
            String[] split1 = br.readLine().split(" ");
            arr[i] = new Question(Integer.parseInt(split1[0]), Integer.parseInt(split1[1]));
        }

        DFS(0, 0, 0);

        System.out.println(max);
    }

    private static void DFS(int sum, int timeSum, int depth) {
        if (timeSum > m) return;
        if (depth == n) {
            max = Math.max(max, sum);
            return;
        }
        DFS(sum + arr[depth].getScore(), timeSum + arr[depth].getTime(), depth + 1);
        DFS(sum, timeSum, depth + 1);
    }
}
