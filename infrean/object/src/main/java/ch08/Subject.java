package ch08;

// 과목이란 객체
public class Subject {
    int score;
    String subjectName;

    public Subject() {}

    public Subject(int score, String subjectName) {
        this.score = score;
        this.subjectName = subjectName;
    }

    public int getScore() {
        return score;
    }
}
