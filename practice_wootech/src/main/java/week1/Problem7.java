package week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem7 {

    public static void main(String[] args) {
        String[][] friends = new String[][]{
                {"donut", "andole"}, {"donut", "jun"}, {"donut", "mrko"},
                {"shakevan", "andole"}, {"shakevan", "jun"}, {"shakevan", "mrko"}
        };

        String[] visitors = new String[]{"bedi", "bedi", "donut", "bedi", "shakevan"};

        System.out.println(solution("mrko", friends, visitors));
    }

    private static List<String> solution(String userName, String[][] friends, String[] visitors) {
        argumentLengthValidate(userName, friends, visitors);

        List<String> myFriends = findByMyFriends(userName, friends);
        Map<String, Integer> friendsForScore = friendsForScore(userName, friends, myFriends, visitors);

        return sortResultFriends(friendsForScore);
    }

    private static List<String> sortResultFriends(Map<String, Integer> friendsForScore) {
        return friendsForScore.entrySet().stream()
                .sorted((entry1, entry2) -> {
                    int compare = entry2.getValue().compareTo(entry1.getValue());
                    if (compare == 0) {
                        return entry1.getKey().compareTo(entry2.getKey());
                    }
                    return compare;
                })
                .limit(5)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    private static Map<String, Integer> friendsForScore(String userName, String[][] friends, List<String> myFriends, String[] visitors) {
        Map<String, Integer> friendsForScore = new HashMap<>();

        calculateFriendshipScore(userName, friends, myFriends, friendsForScore);
        calculateVisitScore(myFriends, visitors, friendsForScore);

        return friendsForScore;
    }

    private static void calculateVisitScore(List<String> myFriends, String[] visitors, Map<String, Integer> friendsForScore) {
        for (String visitor : visitors) {
            friendIdLengthValidate(visitor);
            if (friendsForScore.containsKey(visitor)) {
                friendsForScore.put(visitor, friendsForScore.get(visitor) + 1);
            } else {
                if (myFriends.contains(visitor) == false) {
                    friendsForScore.put(visitor, friendsForScore.getOrDefault(visitor, 0) + 1);
                }
            }
        }
    }

    private static void calculateFriendshipScore(String userName, String[][] friends, List<String> myFriends, Map<String, Integer> friendsForScore) {
        for (String[] friend : friends) {
            for (String myFriend : myFriends) {
                if (friend[0].equals(myFriend) && !friend[1].equals(userName)) {
                    friendsForScore.put(friend[1], friendsForScore.getOrDefault(friend[1], 0) + 10);
                } else if (friend[1].equals(myFriend) && !friend[0].equals(userName)) {
                    friendsForScore.put(friend[0], friendsForScore.getOrDefault(friend[0], 0) + 10);
                }
            }
        }
    }

    private static List<String> findByMyFriends(String userName, String[][] friends) {
        List<String> friendList = new ArrayList<>();

        for (String[] friend : friends) {
            friendValidate(friend);

            if (friend[0].equals(userName)) {
                friendList.add(friend[1]);
            } else if (friend[1].equals(userName)) {
                friendList.add(friend[0]);
            }
        }

        return friendList;
    }

    private static void argumentLengthValidate(String userName, String[][] friends, String[] visitors) {
        if (userName.length() < 1 || userName.length() > 30) {
            throw new IllegalArgumentException("user 는 길이가 1 이상 30 이하인 문자열이여야 합니다.");
        }

        if (friends.length < 1 || friends.length > 10000) {
            throw new IllegalArgumentException("friends 는 길이가 1 이상 10,000 이하이여야 합니다.");
        }

        if (visitors.length > 10000) {
            throw new IllegalArgumentException("visitors 의 길이는 0 이상 10,000 이하여야 합니다.");
        }
    }

    private static void friendValidate(String[] friend) {
        if (friend.length != 2) {
            throw new IllegalArgumentException("friends의 원소의 길이는 2인 리스트/배열 이여야 합니다.");
        }

        if (friendIdLengthValidate(friend[0]) == false || friendIdLengthValidate(friend[1]) == false) {
            throw new IllegalArgumentException("아이디는 길이가 1 이상 30 이하여야 합니다.");
        }

        if (friendIdIsLowerCase(friend[0]) == false || friendIdIsLowerCase(friend[1]) == false) {
            throw new IllegalArgumentException("사용자 아이디는 알파벳 소문자로만 이루어져 있어야 합니다.");
        }
    }

    private static boolean friendIdLengthValidate(String id) {
        return id.length() >= 1 && id.length() <= 30;
    }

    private static boolean friendIdIsLowerCase(String id) {
        String lowerCase = id.toLowerCase();
        return id.equals(lowerCase);
    }
}
