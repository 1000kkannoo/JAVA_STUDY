package ch08;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        Student studentKim = new Student(101, "Kim");

        studentLee.setKoreanSubject("국어",100);
        studentLee.setMathSubject("수학",95);

        studentKim.setKoreanSubject("국어",80);
        studentKim.setMathSubject("수학",99);

        studentLee.showStudentScore();
        studentKim.showStudentScore();

        Scanner sc = new Scanner(System.in);
        System.out.println("김선생님, 점수가 궁금한 과목을 입력해주세요");
        String subject = sc.next();
        System.out.println("입력하신 " + subject + " 과목의 점수는 " + studentKim.getSubjectScore(subject));

        System.out.println(studentLee.getStudentId());
        studentKim.setStudentName("James");
        studentKim.showStudentScore();
    }
}
