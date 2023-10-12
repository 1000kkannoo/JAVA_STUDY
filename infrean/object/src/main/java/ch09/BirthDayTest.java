package ch09;

public class BirthDayTest {

    public static void main(String[] args) {
        // 초기화 하면 기본값이 들어감
        BirthDay day = new BirthDay();
        BirthDay birthDay = new BirthDay();

        day.setYear(2023);
        day.setMonth(1);
        day.setDay(30);

        birthDay.setYear(2023);
        birthDay.setMonth(10);
        birthDay.setDay(23);

        System.out.println(day.isValid());
        System.out.println(birthDay.isValid());
        // this의 이해

        System.out.println(day);
        System.out.println(day);
        day.printThis();
        birthDay.printThis();

        birthDay.printThisMessage();
    }
}
