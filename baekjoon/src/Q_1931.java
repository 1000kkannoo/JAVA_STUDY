import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Room implements Comparable<Room>{
    int start;
    int end;

    public Room(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Room o) {
        if (this.end == o.end) return this.start - o.start;
        return this.end - o.end;
    }
}

public class Q_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Room> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arrayList.add(new Room(start,end));
        }

        Collections.sort(arrayList);

        int answer = 1;
        int limit = arrayList.get(0).end;
        for (int i = 1; i < n; i++) {
            Room room = arrayList.get(i);
            if (room.start >= limit) {
                limit = room.end;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
