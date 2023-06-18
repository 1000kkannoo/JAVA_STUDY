package main.study.setion10_동적계획법;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Box implements Comparable<Box> {
    int underside;
    int height;
    int weight;

    public Box(int underside, int height, int weight) {
        this.underside = underside;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Box ob) {
        return ob.underside - this.underside;
    }
}

public class S11Q4_가장_높은_탑_쌓기 {
    static int[] dy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Box> boxes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int under = sc.nextInt();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            boxes.add(new Box(under, height, weight));
        }

        dy = new int[n];
        System.out.println(solution(n, boxes));
    }

    private static int solution(int n, ArrayList<Box> boxes) {
        int answer = 0;
        Collections.sort(boxes);
        dy[0] = boxes.get(0).height;
        answer = dy[0];
        for (int i = 1; i < boxes.size(); i++) {
            int max_h = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (boxes.get(j).weight > boxes.get(i).weight && dy[j] > max_h) {
                    max_h = dy[j];
                }
            }
            dy[i] = max_h + boxes.get(i).height;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }
}
