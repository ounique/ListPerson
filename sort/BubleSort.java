package main.sort;

import main.comparators.IComparator;

public class BubleSort<T> implements ISorter<T> {
    @Override
    public void sort(T[] array, IComparator<T> comparator) {
        T temp;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {
                if (comparator.compare(array[j - 1], array[j]) == -1) {
                    //swap elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
