package main.checker;
import main.essences.Person;

public class CheckerById implements IChecker<Person> {
    @Override
    public boolean check(Person a, Object value){
        return value.equals(a.getId());
    }
}
