package main.Repository;

import main.comparators.IComparator;
import main.sort.ISorter;

public abstract class Repository<T> implements IRepository<T>{
    private T[] array;
    private int length = 0;
    private IComparator<T> comparator;
    private ISorter<T> sorter;
}
