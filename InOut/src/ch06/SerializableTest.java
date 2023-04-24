package ch06;

import java.io.*;

class Person implements Externalizable {

    private static final long serialVersionUID = 1L;

    String name;
    transient String job;

    public Person() {
    }

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return name + "," + job;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        // out.writeUTF(job);
        out.writeUTF(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // job = in.readUTF();
        name = in.readUTF();
    }
}

public class SerializableTest {

    public static void main(String[] args) {
        Person personKim = new Person("kim", "manager");
        Person personLee = new Person("Lee", "Leader");

        try (FileOutputStream fos = new FileOutputStream("serial.out");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(personKim);
            oos.writeObject(personLee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileInputStream fis = new FileInputStream("serial.out");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person ps1 = (Person) ois.readObject();
            Person ps2 = (Person) ois.readObject();

            System.out.println(ps1);
            System.out.println(ps2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
