package main.checker;

public interface IChecker<T> {
    boolean check(T a, Object value);
}
