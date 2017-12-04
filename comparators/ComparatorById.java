package main.comparators;

import main.Person;

public class ComparatorById implements PersonComparator {
    /**
     * Comprare persons by ID
     * @param a
     * @param b
     * @return
     */
    @Override
    public int compare(Person a, Person b){
        if (a == null)
            return -1;
        if (b == null)
            return 1;
        if (a == null && b == null)
            return 0;
        return a.getId() > b.getId() ? 1 :(a.getId() == b.getId() ? 0 : -1);
    }
}
