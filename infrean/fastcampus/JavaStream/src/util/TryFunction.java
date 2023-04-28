package util;

@FunctionalInterface
public interface TryFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
