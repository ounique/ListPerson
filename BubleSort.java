package main;

public class BubleSort extends PersonSort {
    public void sort(Person[] persons, PersonComparator comparator) {
        Person temp;
        int length = persons.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {
                if (comparator.comprareTo(persons[j - 1], persons[j]) == 1) {
                    //swap elements
                    temp = persons[j - 1];
                    persons[j - 1] = persons[j];
                    persons[j] = temp;
                }
            }
        }
    }
}
