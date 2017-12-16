package main.Repository;
public interface IRepository<T>{
    int size();
    void remove(Object value);
    void add(T value);
    void sort();
    boolean contains(Object value);
    T[] toArray(T[] a);
}
