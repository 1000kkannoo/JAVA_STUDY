import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_2993 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        String bestWord = word;
        for (int i = 1; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                String part1 = new StringBuilder(word.substring(0, i)).reverse().toString();
                String part2 = new StringBuilder(word.substring(i, j)).reverse().toString();
                String part3 = new StringBuilder(word.substring(j)).reverse().toString();

                String newWord = part1 + part2 + part3;
                if (newWord.compareTo(bestWord) < 0) bestWord = newWord;
            }
        }

        System.out.println(bestWord);
        br.close();
    }
}
