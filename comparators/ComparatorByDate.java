package main.comparators;

import main.essences.Person;

public class ComparatorByDate implements IComparator<Person> {
    /**
     * Comprare two exemplars of Person class.
     * @param a
     * @param b
     * @return 1 if a more than b , 0 if a are equal b. and -1 if b more than a
     */
    @Override
    public int compare(Person a, Person b) {
        if (a == null)
            throw new NullPointerException();
        if (b == null)
            throw new NullPointerException();
        if (a == null && b == null)
            throw new NullPointerException();
        return a.getDate().compareTo(b.getDate());
    }
}
