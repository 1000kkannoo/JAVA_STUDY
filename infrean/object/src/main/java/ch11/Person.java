package ch11;

class Persons {
    private String name;
    private int age;

    public Persons() {
        this("이름없음", 1);
    }

    private Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Persons create(String name, int age) {
        return new Persons(name, age);
    }

    public Persons getPerson() {
        return this; // address 를 가리킴
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Person {

    public static void main(String[] args) {
        Persons person = new Persons();
        Persons person1 = Persons.create("잭 그릴리쉬", 27);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person.getName());

        System.out.println(person.getPerson());
        System.out.println(person1.getPerson());
    }
}
