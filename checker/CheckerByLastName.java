package main.checker;

import main.essences.Person;

public class CheckerByLastName implements IChecker<Person> {
    public boolean check(Person a, Object value){
        return a.getLastName().equals(value);
    }
}
