package main.checker;

import main.essences.Person;

public class CheckerByDate implements IChecker<Person>{
    @Override
    public boolean check(Person a, Object value){
        return a.getDate().equals(value);
    }
}
