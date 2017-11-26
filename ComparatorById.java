package main;

public class ComparatorById extends PersonComparator{
    public int comprareTo(Person a, Person b){
        return a.getId() > b.getId() ? 1 : a.getId() == b.getId() ? 0 : -1;
    }
}
