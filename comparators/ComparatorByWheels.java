package main.comparators;

import main.essences.Car;

public class ComparatorByWheels implements IComparator<Car> {

    @Override
    public int compare(Car a, Car b) {
        if(a == null || b == null)
            throw new NullPointerException();
        return a.getCountWheels() > b.getCountWheels() ? 1 : (a.getCountWheels() == b.getCountWheels() ? 0 : -1);
    }
}
