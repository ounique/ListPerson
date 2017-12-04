package main;
import main.checker.PersonChecker;
import main.comparators.PersonComparator;
import main.sort.PersonSort;
import org.joda.time.LocalDate;

import java.io.IOException;
import java.util.Arrays;

public class List {

    private static int counter = -1;
    private int length = 0;
    private Person[] humans = new Person[10];
    private PersonComparator comparator;
    private PersonSort sortMethod;
    private PersonChecker checker;

    /**
     * @return Count of elements in list.
     */
    public int getLength() {
        return length;
    }

    /**
     * Add person into list.
     * @param lastName Surname of person.
     * @param date Birthday of person.
     */
    public void addPerson(String lastName, LocalDate date){
        Person person = new Person(lastName, date, ++counter);
        if (length == humans.length)
        {
            int len = humans.length;
            humans = Arrays.copyOf(humans, humans.length*2);
            humans[len] = person;
        }
        else
            for (int i = 0; i < humans.length; i++)
                if (humans[i] == null) {
                    humans[i] = person;
                    break;
                }
        length++;
        try {
            Configurator.getComparator();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param id Id person, which you would take from list.
     * @return Info about person or message that you send incorrect id.
     */
    public String search(int id) {
        for (int i = 0; i < length; i++)
            if(humans[i].getId() == id) {
                return "id: " + humans[i].getId() + " Name: " + humans[i].getLastName() + " Birthday: " + humans[i].getDate();
            }
        return "Не существует человека с таким id";
    }

    /**
     * Remove first user with id equal to id in param.
     * @param id  id User which you would like to remove.
     * @return Message about action result.
     */
    public String removePerson(int id) {
        for (int i = 0; i < length; i++) {
            if (humans[i].getId() == id){
                for (int j = i; j < humans.length - 1; j++)
                    humans[j] = humans[j+1];
                humans[humans.length - 1] = null;
                length--;
                return "Пользователь с id: " + id + " успешно удален.";
            }
        }
        return "Пользователь с id:" + id + " отсутсвует в списке.";
    }

    /**
     * Sort array of person by personSort method and comrare by comparator.
     * @param comparator
     * @param personSort person sort method.
     */
    public void sort(PersonComparator comparator, PersonSort personSort) {
       personSort.sort(humans, comparator);
    }

    /**
     * Print info about all persons in list.
     */
    public Person[] print() {
        Person[] persons = new Person[length];
        for (int i = 0; i < length; i++)
            persons[i] = humans[i];
        return persons;
    }
}
