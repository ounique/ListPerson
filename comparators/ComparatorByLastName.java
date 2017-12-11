package main.comparators;

import main.essences.Person;

public class ComparatorByLastName implements IComparator<Person> {
    /**
     * Comprare two exemplars of Person class by person comporator settings.
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
        int length = a.getLastName().length() > b.getLastName().length() ? b.getLastName().length() : a.getLastName().length();
        char[] arrayFirst = a.getLastName().toCharArray();
        char[] arraySecond = b.getLastName().toCharArray();
        for (int i = 0; i < length; i++)
        {
            if (arrayFirst[i] > arraySecond[i])
                return -1;
            if (arrayFirst[i] < arraySecond[i])
                return 1;
        }
        return a.getLastName().length() > b.getLastName().length() ? 1 : (a.getLastName().length() == b.getLastName().length() ? 0 : -1);
    }
}
