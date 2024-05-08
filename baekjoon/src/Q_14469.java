import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class Cow implements Comparable<Cow> {
    public int arrivalTime;
    public int inspectionTime;

    public Cow(int arrivalTime, int inspectionTime) {
        this.arrivalTime = arrivalTime;
        this.inspectionTime = inspectionTime;
    }

    @Override
    public int compareTo(Cow o) {
        return this.arrivalTime - o.arrivalTime;
    }
}

public class Q_14469 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Cow> cows = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int arrivalTime = Integer.parseInt(input[0]);
            int inspectionTime = Integer.parseInt(input[1]);
            cows.add(new Cow(arrivalTime, inspectionTime));
        }

        int currentTime = 0;

        while (!cows.isEmpty()) {
            Cow cow = cows.poll();
            if (currentTime < cow.arrivalTime) {
                currentTime = cow.arrivalTime;
            }
            currentTime += cow.inspectionTime;
        }

        System.out.println(currentTime);
    }
}
