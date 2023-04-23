package ch11;

public class Person {

    private String name;
    private int age;

    public Person() {
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getPerson() {
        return this; // address 를 가리킴
    }

    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("잭 그릴리쉬",27);
        System.out.println(person1.name);
        System.out.println(person1.age);

        System.out.println(person.getPerson());
        System.out.println(person1.getPerson());
    }
}
