package main.Repository;

import main.Config.Configurator;
import main.essences.Car;

import java.io.IOException;

public class CarRepository extends Repository<Car> {

    @Override
    public void remove(Object value) {
        removeByNumber((String)value);
    }
    private void removeByNumber(String value) {
        for (int i = 0; i < length; i++) {
            if (((Car) array[i]).getNumber().compareTo(value) == 0) {
                for (int j = i; j < array.length - 1; j++)
                    array[j] = array[j + 1];
                array[array.length - 1] = null;
                length--;
            }
        }
    }

    public CarRepository() throws IOException {
        sorter = Configurator.getCarSorter();
        comparator = Configurator.getCarComparator();
        checker = Configurator.getCarChecker();
    }
}
