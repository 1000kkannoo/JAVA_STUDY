package ch01;

public class GenericPrinter<T> {

    private T material;

    public void serMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return material.toString();
    }
}
