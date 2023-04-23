package ch08;

// 학생의 객체
// 학생은 과목을 가지고 있음.
public class Student {
    Subject korean;
    Subject math;
    private int studentId;
    private String studentName;

    public Student(int id, String name) {
        this.studentId = id;
        this.studentName = name;

        // 클래스 변수들은 생성자를 무조건 생성해야함
        // String 클래스는 예외
        korean = new Subject();
        math = new Subject();
    }

    public void setKoreanSubject(String name, int score) {
        korean.subjectName = name;
        korean.score = score;
    }

    public void setMathSubject(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    public void showStudentScore() {
        int total = korean.score + math.score;
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }

    public int getSubjectScore(String subject){
        if (subject.equals("수학")){
            return math.score;
        }
        else if (subject.equals("국어")) {
            return korean.score;
        }
        else {
        throw new NullPointerException("해당 과목은 존재하지 않습니다.");
        }
        // else 를 사용하여 return 해도 되지만, 굳이 필요하지 않기에
        // 상황에 필요한 코딩컨벤션을 이용해 return 하는 것이 좋음
        // return korean.score;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }
}
