import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Book implements Comparable<Book> {
    String name;
    int sales;

    private Book(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }

    public static Book create(String name, int sales) {
        return new Book(name, sales);
    }

    @Override
    public int compareTo(Book o) {
        if (o.sales == this.sales) return this.name.compareTo(o.name);
        return o.sales - this.sales;
    }
}

public class Q_1302 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String book = br.readLine();
            map.put(book, map.getOrDefault(book, 0) + 1);
        }

        String maxName = "";
        ArrayList<Book> arr = new ArrayList<>();
        for (String name : map.keySet()) {
            int value = map.get(name);
            arr.add(Book.create(name, value));
        }

        Collections.sort(arr);

        System.out.println(arr.get(0).name);
    }
}
