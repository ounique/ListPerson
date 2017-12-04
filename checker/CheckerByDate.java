package main.checker;

import main.Person;

public class CheckerByDate implements PersonChecker{
    @Override
    public boolean check(Person a, Object value){
        return a.getDate().equals(value);
    }
}
