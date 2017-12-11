package main.sort;

import main.comparators.IComparator;

public interface ISorter<T> {
    void sort(T[] array, IComparator<T> comparator);
}
