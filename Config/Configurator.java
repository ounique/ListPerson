package main.Config;

import main.checker.*;
import main.comparators.*;
import main.essences.Car;
import main.essences.Person;
import main.sort.BubleSort;
import main.sort.ISorter;
import main.sort.QuickSort;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configurator {

    public static final String PATH_TO_PROPERTIES = "src/main/resources/config.properties";

    public static ISorter<Person> getPersonSorter() throws IOException {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
        properties.load(fileInputStream);
        String sorter = properties.getProperty("personSorter");
        switch (sorter){
            case "bubble":
                return new BubleSort<Person>();
            case "quick":
                return new QuickSort<Person>();
            default:
                return null;
        }
    }
    public static IComparator<Person> getPersonComparator() throws IOException {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
        properties.load(fileInputStream);
        String commparator = properties.getProperty("personComparator");
        switch (commparator){
            case "date":
                return new ComparatorByDate();
            case "id":
                return new ComparatorById();
            case "name":
                return new ComparatorByLastName();
            default:
                return null;
        }
    }
    public static IChecker<Person> getPersonChecker() throws IOException {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
        properties.load(fileInputStream);
        String checker = properties.getProperty("personChecker");
        switch (checker){
            case "date":
                return new CheckerByDate();
            case "id":
                return new CheckerById();
            case "name":
                return new CheckerByLastName();
            default:
                return null;
        }
    }

    public static ISorter<Car> getCarSorter() throws IOException {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
        properties.load(fileInputStream);
        String sorter = properties.getProperty("carSorter");
        switch (sorter){
            case "bubble":
                return new BubleSort();
            case "quick":
                return new QuickSort();
            default:
                return null;
        }
    }
    public static IComparator<Car> getCarComparator() throws IOException {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
        properties.load(fileInputStream);
        String commparator = properties.getProperty("carComparator");
        switch (commparator){
            case "countWheels":
                return new ComparatorByWheels();
            case "number":
                return new ComparatorByNumber();
            case "sound":
                return new ComparatorBySound();
            default:
                return null;
        }
    }
    public static IChecker<Car> getCarChecker() throws IOException {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
        properties.load(fileInputStream);
        String checker = properties.getProperty("carChecker");
        switch (checker){
            case "number":
                return new CheckerByNumber();
            case "wheels":
                return new CheckerByCountWheels();
            case "sound":
                return new CheckerBySound();
            default:
                return null;
        }
    }

}