package main.checker;

import main.essences.Car;

public class CheckerByCountWheels implements IChecker<Car> {
    @Override
    public boolean check(Car a, Object value) {
        return a.getCountWheels() == (int)value;
    }
}
