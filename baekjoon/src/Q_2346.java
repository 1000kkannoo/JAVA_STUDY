import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Number {
    private int index;
    private int move;

    public Number(int index, int move) {
        this.index = index;
        this.move = move;
    }

    public int getIndex() {
        return index;
    }

    public int getMove() {
        return move;
    }
}

public class Q_2346 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Deque<Number> deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            deque.offerLast(new Number(i, Integer.parseInt(st.nextToken())));
        }

        Number first = deque.pollFirst();
        int move = first.getMove();
        sb.append(first.getIndex()).append(" ");

        while (!deque.isEmpty()) {
            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    deque.offerLast(deque.pollFirst());
                }
                Number number = deque.pollFirst();
                move = number.getMove();
                sb.append(number.getIndex()).append(" ");
            } else {
                for (int i = 0; i > move + 1; i--) {
                    deque.offerFirst(deque.pollLast());
                }
                Number number = deque.pollLast();
                move = number.getMove();
                sb.append(number.getIndex()).append(" ");
            }
        }

        System.out.println(sb);
    }
}
