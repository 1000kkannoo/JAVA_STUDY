package ch04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StudentTest {

    @DisplayName("학생의 이름을 가져온다.")
    @Test
    void getStudentName() {
        // given
        Student student = new Student(1, "김덕배");

        // when
        String studentName = student.getStudentName();

        // then
        assertThat(studentName).isEqualTo("김덕배");
    }

}