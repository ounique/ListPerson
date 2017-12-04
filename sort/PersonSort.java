package main.sort;

import main.Person;
import main.comparators.PersonComparator;

public interface PersonSort {
    void sort(Person[] persons, PersonComparator comparator);
}
