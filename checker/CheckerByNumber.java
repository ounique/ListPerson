package main.checker;

import main.essences.Car;

public class CheckerByNumber implements IChecker<Car>{
    @Override
    public boolean check(Car a, Object value) {
        return a.getNumber().equals(value);
    }
}
