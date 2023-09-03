import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6 {

    public static void main(String[] args) {
        String[][] emailArray = {
                {"jm@email.com", "제이엠"},
                {"jason@email.com", "제이슨"},
                {"woniee@email.com", "워니"},
                {"mj@email.com", "엠제이"},
                {"nowm@email.com", "이제엠"}
        };

        System.out.println(solution(emailArray));
    }

    private static List<String> solution(String[][] emailArray) {
        Map<String, Integer> map = emailsBySubstring(emailArray);
        HashSet<String> resultSet = checkNickName(emailArray, map);

        return sortList(resultSet);
    }

    private static Map<String, Integer> emailsBySubstring(String[][] emailArray) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] strings : emailArray) {
            String email = strings[0];
            String nickName = strings[1];

            myAccountValidate(email, nickName);

            for (int j = 0; j < nickName.length() - 1; j++) {
                String subNickName = nickName.substring(j, j + 2);
                map.put(subNickName, map.getOrDefault(subNickName, 0) + 1);
            }
        }
        return map;
    }

    private static HashSet<String> checkNickName(String[][] emailArray, Map<String, Integer> map) {
        HashSet<String> resultSet = new HashSet<>();
        for (String[] strings : emailArray) {
            String email = strings[0];
            String nickName = strings[1];

            for (String key : map.keySet()) {
                if (map.get(key) >= 2 && nickName.contains(key)) {
                    resultSet.add(email);
                    break;
                }
            }
        }
        return resultSet;
    }

    private static List<String> sortList(HashSet<String> resultSet) {
        List<String> result = new ArrayList<>(resultSet);
        Collections.sort(result);
        return result;
    }

    private static void myAccountValidate(String email, String nickName) {
        if (!email.contains("email.com")) {
            throw new IllegalArgumentException("도메인은 email.com 만 가능합니다.");
        }

        if (!validateKorean(nickName)) {
            throw new IllegalArgumentException("닉네임은 한글만 가능합니다.");
        }

        if (nickName.length() >= 20 || nickName.length() < 1) {
            throw new IllegalArgumentException("닉네임의 길이는 1자 이상 20자 미만 이여야 합니다.");
        }
    }

    public static boolean validateKorean(String word) {
        Pattern validateKoreanPattern = Pattern.compile("^[가-힣]+$");
        Matcher matcher = validateKoreanPattern.matcher(word);

        return matcher.matches();
    }
}
