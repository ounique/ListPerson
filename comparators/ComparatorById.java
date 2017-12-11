package main.comparators;

import main.essences.Person;

public class ComparatorById implements IComparator<Person> {
    /**
     * Comprare persons by ID
     * @param a
     * @param b
     * @return
     */
    @Override
    public int compare(Person a, Person b){
        if (a == null)
            throw new NullPointerException();
        if (b == null)
            throw new NullPointerException();
        if (a == null && b == null)
            throw new NullPointerException();
        return a.getId() > b.getId() ? 1 :(a.getId() == b.getId() ? 0 : -1);
    }
}
