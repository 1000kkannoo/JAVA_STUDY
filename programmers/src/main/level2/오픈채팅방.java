package main.level2;

import java.util.ArrayList;
import java.util.HashMap;

public class 오픈채팅방 {
    public static void main(String[] args) {
        for (String st : solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"})) {
            System.out.println(st);
        }
    }

    public static String[] solution(String[] record) {
        HashMap<String, String> user = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();

        for (String s : record) {
            String[] tokens = s.split(" ");
            String cmd = tokens[0];
            String id = tokens[1];
            if (cmd.equals("Enter")) {
                String nickname = tokens[2];
                user.put(id, nickname);
                arr.add(id + "님이 들어왔습니다.");
            } else if (cmd.equals("Leave")) {
                arr.add(id + "님이 나갔습니다.");
            } else {
                String nickname = tokens[2];
                user.put(id, nickname);
            }
        }

        String[] answer = new String[arr.size()];

        int i = 0;
        for (String str : arr) {
            String id = str.split("님")[0];
            answer[i++] = str.replace(id, user.get(id));
        }

        return answer;
    }
}
