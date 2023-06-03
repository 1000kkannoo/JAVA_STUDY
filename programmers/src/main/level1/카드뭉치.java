package main.level1;

public class 카드뭉치 {
    public static void main(String[] args) {
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(cards1,cards2,goal));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cards1Index = 0;
        int cards2Index = 0;
        int stop = 0;
        String[] card = cards1;
        for (int i = 0; i < goal.length; i++) {
            if (card == cards1) {
                if (cards1Index >= cards1.length || goal[i].equals(card[cards1Index]) == false) {
                    card = cards2;
                    stop++;
                    i--;
                } else {
                    stop = 0;
                    cards1Index++;
                    continue;
                }

            } else if (card == cards2) {
                if (cards2Index >= cards2.length || goal[i].equals(card[cards2Index]) == false) {
                    card = cards1;
                    stop++;
                    i--;
                }
                else {
                    stop = 0;
                    cards2Index++;
                    continue;
                }
            }

            if (stop > 2) {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}
