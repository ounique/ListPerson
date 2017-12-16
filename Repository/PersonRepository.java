package main.Repository;
import main.Config.Configurator;
import main.essences.Person;

import java.io.IOException;

public class PersonRepository extends Repository<Person>{

    @Override
    public void remove(Object value) {
        removeById((Integer) value);
    }

    public PersonRepository() throws IOException {
        sorter = Configurator.getPersonSorter();
        comparator = Configurator.getPersonComparator();
        checker = Configurator.getPersonChecker();
    }

    private void removeById(int value){
        for (int i = 0; i < length; i++) {
            if (((Person)array[i]).getId() == value){
                for (int j = i; j < array.length - 1; j++)
                    array[j] = array[j+1];
                array[array.length - 1] = null;
                length--;
            }
        }
    }
}
