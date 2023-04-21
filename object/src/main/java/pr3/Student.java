package pr3;

import java.util.ArrayList;

public class Student {

    int studentId;
    String studentName;

    ArrayList<Subject> subjects = new ArrayList<Subject>();

    public Student(int studentId, String studentName) {
        this.studentId =studentId;
        this.studentName = studentName;
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);

        subjects.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        for(Subject s : subjects){
            total += s.getScorePoint();
            System.out.println(studentName + "학생의 " + s.getName() + "과목 성적은 " + s.getScorePoint() + "입니다. ");
        }
        System.out.println(studentName + "학생의 총점은 " + total + "입니다.");
    }

}
