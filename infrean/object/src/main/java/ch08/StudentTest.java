package ch08;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        Student studentKim = new Student(101, "Kim");

        studentLee.setKoreanSubject("국어", 100);
        studentLee.setMathSubject("수학", 95);

        studentKim.setKoreanSubject("국어", 80);
        studentKim.setMathSubject("수학", 99);

        studentLee.showStudentScore();
        studentKim.showStudentScore();

        Scanner sc = new Scanner(System.in);
        System.out.println("김선생님, 점수가 궁금한 과목을 입력해주세요");
        String subject = sc.next();
        System.out.println("입력하신 " + subject + " 과목의 점수는 " + studentKim.getSubjectScore(subject));

        System.out.println(studentLee.getStudentId());
        studentKim.setStudentName("James");
        studentKim.showStudentScore();

        System.out.println("=================");

        Student studentPark = new Student(10, "박지성", null, new Subject(88, "국어"), new Subject(99, "수학"));

        System.out.println(studentPark.getStudentId());
        System.out.println(studentPark.getSubjectScore("수학"));

        int score = studentPark.getKorean().getScore();
        System.out.printf("국어 점수는 %s 입니다.\n", score);

        String studentCard = studentPark.getStudentCardOptional().orElse("아직 등록된 카드가 없습니다.");
        System.out.println(studentCard);

    }
}
