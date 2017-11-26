package main;

public class ComparatorById extends PersonComparator{
    public int comprareTo(Person a, Person b){
        if (a == null)
            return -1;
        if (b == null)
            return 1;
        if (a == null && b == null)
            return 0;
        return a.getId() > b.getId() ? 1 : a.getId() == b.getId() ? 0 : -1;
    }
}
