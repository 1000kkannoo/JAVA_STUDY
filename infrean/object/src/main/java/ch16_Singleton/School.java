package ch16_Singleton;

import java.util.Calendar;

// 싱글톤패턴
// 단 하나의 객체를 가지는 패턴
/*
하나의 학교만 있다고 생각하면 다양한 과목, 학생들이 있다 가정해도
학교는 단 하나만 있기에 싱글톤패턴으로 하나의 객체만 가질 수 있도록 생성
 */
public class School {

    private static School instance = new School();

    private School() {}

    public static School getInstance() {
        if(instance == null) {
            instance = new School();
        }
        return instance;
    }

    Calendar calendar = Calendar.getInstance();

}
