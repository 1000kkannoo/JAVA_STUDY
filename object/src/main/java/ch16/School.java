package ch16;

import java.util.Calendar;

// 싱글톤패턴
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
