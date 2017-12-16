package main.checker;

import main.essences.Car;

public class CheckerBySound implements IChecker<Car> {
    @Override
    public boolean check(Car a, Object value) {
        return a.getSound().equals(value);
    }
}
