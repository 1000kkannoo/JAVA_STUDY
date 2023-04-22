package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonClassTest {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException,
            InstantiationException, IllegalAccessException, NoSuchMethodException {

        Person person = new Person("James");
        System.out.println(person);

        Class c = Class.forName("ch04.Person");
        Class[] parameterTypes = {String.class};
        Constructor constructor = c.getConstructor(parameterTypes);

        Object[] initargs = {"김유신"};
        Person personKim = (Person) constructor.newInstance(initargs);

        System.out.println(personKim);
    }
}
