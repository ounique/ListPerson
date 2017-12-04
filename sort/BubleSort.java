package main.sort;

import main.Person;
import main.comparators.PersonComparator;

public class BubleSort implements PersonSort {
    /**
     * Sort array persons by comparator settings.
     * @param persons Array of Persons
     * @param comparator Exemplar of PersonComparator, which tells how comprare two persons.
     */
    @Override
    public void sort(Person[] persons, PersonComparator comparator) {
        Person temp;
        int length = persons.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {
                if (comparator.compare(persons[j - 1], persons[j]) == -1) {
                    //swap elements
                    temp = persons[j - 1];
                    persons[j - 1] = persons[j];
                    persons[j] = temp;
                }
            }
        }
    }
}
