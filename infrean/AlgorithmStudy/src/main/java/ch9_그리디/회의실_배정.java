package ch9_그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

class Room {
    private int start;
    private int end;

    public Room(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}

public class 회의실_배정 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = parseInt(br.readLine());
        Room[] rooms = new Room[n];
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            int start = parseInt(split[0]);
            int end = parseInt(split[1]);
            rooms[i] = new Room(start, end);
        }

        Arrays.sort(rooms, (r1, r2) -> {
            if (r1.getEnd() == r2.getEnd()) {
                return r1.getStart() - r2.getStart();
            }
            return r1.getEnd() - r2.getEnd();
        });

        int answer = 0;
        int endTime = 0;
        for (Room room : rooms) {
            if (endTime <= room.getStart()) {
                endTime = room.getEnd();
                answer++;
            }
        }

        System.out.println(answer);
    }
}
