package main.comparators;

import main.essences.Car;

public class ComparatorBySound implements IComparator<Car> {

    @Override
    public int compare(Car a, Car b) {
        if(a == null || b == null)
            throw new NullPointerException();
        return a.getSound().compareTo(b.getSound()) < 0 ? 1 : (a.getSound().compareTo(b.getSound()) == 0 ? 0 : -1);
    }
}
