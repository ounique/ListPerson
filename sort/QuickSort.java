package main.sort;

import main.comparators.IComparator;

public class QuickSort<T> implements ISorter<T> {
    @Override
    public void sort(T[] array, IComparator<T> comparator) {
        QS(array, comparator, 0, array.length - 1);
    }

    private void QS(T[] array, IComparator<T> comparator, int a, int b)
    {
        if (a >= b) return;
        int c = partition(array, comparator, a, b);
        QS(array, comparator, a, c - 1);
        QS(array, comparator,c + 1, b);
    }

    private int partition(T[] array, IComparator<T> comparator, int a, int b)
    {
        int i = a;
        for (int j = a; j <= b; j++)
        {
            if (comparator.compare(array[j], array[b]) <= 0)
            {
                T t = array[i];
                array[i] = array[j];
                array[j] = t;
                i++;
            }
        }
        return i - 1;
    }
}
