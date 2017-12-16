package main;

import main.Repository.CarRepository;
import main.Repository.PersonRepository;
import main.essences.Car;
import main.essences.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.LocalDate;

import java.io.IOException;


public class Main {


    private static Logger log = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {

        PersonRepository a = new PersonRepository();
        Person temp = new Person("Карпов Евгений", new LocalDate(1998, 10, 10), 0);
        a.add(temp);
        log.info("Add into list person - " + temp.getInfo());
        temp = new Person("Сигарев Алексей", new LocalDate(2000, 7, 20), 1);
        a.add(temp);
        log.info("Add into list person - " + temp.getInfo());
        temp = new Person("Артем Азаров", new LocalDate(1996, 10, 5), 2);
        a.add(temp);
        log.info("Add into list person - " + temp.getInfo());

        Person[] b = a.toArray(new Person[1]);
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i].getInfo());
        }
        a.sort();
        log.info("Sort collection PersonRepository");
        Person[] c = a.toArray(new Person[1]);
        for(int i = 0; i < c.length; i++){
            System.out.println(c[i].getInfo());
        }

        CarRepository car = new CarRepository();
        Car temp2 = new Car("e750kx", "bip-bip", 4);
        car.add(temp2);
        log.info("Add into CarRepository - " + temp.getInfo());
        temp2 = new Car("a001aa", "tu-tu", 3);
        car.add(temp2);
        log.info("Add into CarRepository - " + temp.getInfo());
        temp2 = new Car("e666ee", "bip-bip", 4);
        car.add(temp2);
        log.info("Add into CarRepository - " + temp.getInfo());
        car.sort();
        log.info("Sort collection CarRepository");
        Car[] arr = car.toArray(new Car[1]);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i].getInfo());
        }
    }
}
