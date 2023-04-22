package ch06;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }

    public void flying() {
        System.out.println("하늘은 독수리만 날 수 있습니다.");
    }
}

public class AnimalTest {

    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(hAnimal);
        animals.add(tAnimal);
        animals.add(eAnimal);

        for (Animal animal : animals) {
            // 한 줄의 코드가 다른 타입이 바인딩 되면서 실행결과가 다르게 나타난다.
            animal.move();
        }
        animalMove(hAnimal);
        animalMove(tAnimal);
        animalMove(eAnimal);

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animals);
    }

    public static void animalMove(Animal animal) {
        animal.move();
    }

    public static void testDownCasting(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBooks();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }
            if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            }
        }
    }
}
