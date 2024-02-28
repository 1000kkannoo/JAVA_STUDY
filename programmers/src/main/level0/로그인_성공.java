package main.level0;

public class 로그인_성공 {
    public static void main(String[] args) {
        String solution = solution(new String[]{"meosseugi", "1234"},
                new String[][]{
                        {"rardss", "123"}, {"yyoom", "1234"},
                        {"meosseugi", "1234"}});

        System.out.println(solution);
    }

    public static String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        for (String[] dbId_pw : db) {
            String dbId = dbId_pw[0];
            String dbPw = dbId_pw[1];
            if (id.equals(dbId)) {
                return (pw.equals(dbPw)) ? "login" : "wrong pw";
            }
        }
        return "fail";
    }
}
