package ch02Lambda;

// 매개변수가 같은것을 방지
@FunctionalInterface
public interface Add {
    public int add(int x, int y);
}
