package ch02;

// Material을 상속받은 T만 사용할 수 있다.
public class GenericPrinter<T extends Material> {
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material.toString();
    }

    public void doPrinting() {
        material.doPrinting();
    }
}

