package main.Repository;

import main.checker.IChecker;
import main.comparators.IComparator;
import main.sort.ISorter;

import java.util.Arrays;

public abstract class Repository<T> implements IRepository<T>{

    protected Object[] array = new Object[10];
    protected int length = 0;
    protected IComparator<T> comparator;
    protected ISorter<T> sorter;
    protected IChecker<T> checker;
    @Override
    public abstract void remove(Object value);

    @Override
    public int size() {
        return length;
    }

    @Override
    public void add(T value) {
        if (length == array.length)
        {
            int len = array.length;
            array = Arrays.copyOf(array, array.length*2);
            array[len] = value;
            length++;
        }
        else array[length++] = value;
    }

    @Override
    public void sort() {
        Object[] temp = new Object[length];
        System.arraycopy(array, 0, temp, 0, length);
        sorter.sort((T[]) temp, comparator);
        System.arraycopy(temp, 0, array, 0, length);
    }

    @Override
    public boolean contains(Object value) {
        for (int i = 0; i < length; i++){
            if (checker.check((T) array[i], value))
                return true;
        }
        return false;
    }

    @Override
    public T[] toArray(T[] a) {
        return (T[]) Arrays.copyOf(array, length, a.getClass());
    }

}
