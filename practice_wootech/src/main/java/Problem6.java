import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6 {
    public static void main(String[] args) {
        String[][] emailArray = {
                {"im@email.com", "제이엠"},
                {"jason@email.com", "제이슨"},
                {"woniee@email.com", "워니"},
                {"mi@email.com", "엠제이"},
                {"nowm@email.com", "이제엠"}
        };
        System.out.println(solution(emailArray));
    }

    private static List<String> solution(String[][] emailArray) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < emailArray.length; i++) {
            String email = emailArray[i][0];
            String nickName = emailArray[i][1];

            myAccountValidate(email, nickName);

            map.put(email, map.getOrDefault(email, 0) + 1);
            
        }
        return null;
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
