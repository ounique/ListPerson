package main.comparators;

import main.essences.Car;

public class ComparatorByNumber implements IComparator<Car> {
    @Override
    public int compare(Car a, Car b) {
        if(a == null || b == null)
            throw new NullPointerException();
        return a.getNumber().compareTo(b.getNumber()) < 0 ? 1 : (a.getNumber().compareTo(b.getNumber()) == 0 ? 0 : -1);
    }
}
