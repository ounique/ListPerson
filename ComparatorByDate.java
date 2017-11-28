package main;

public class ComparatorByDate extends PersonComparator{
    /**
     * Comprare two exemplars of Person class.
     * @param a
     * @param b
     * @return 1 if a more than b , 0 if a are equal b. and -1 if b more than a
     */
    public int comprareTo(Person a, Person b) {
        if (a == null)
            return -1;
        if (b == null)
            return 1;
        if (a == null && b == null)
            return 0;
        return a.getDate().compareTo(b.getDate());
    }
}
