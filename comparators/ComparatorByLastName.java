package main.comparators;

import main.Person;

public class ComparatorByLastName implements PersonComparator {
    /**
     * Comprare two exemplars of Person class by person comporator settings.
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
