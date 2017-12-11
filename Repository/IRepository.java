package main.Repository;

public interface IRepository<T>{
    void remove(Object value);
    void add(Object value);
    void sort();
    T[] search(Object value);
    T[] getRepository();
}
