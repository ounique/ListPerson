package main;

import main.checker.CheckerByDate;
import main.checker.IChecker;
import main.comparators.ComparatorByDate;
import main.comparators.IComparator;
import main.essences.Person;
import main.sort.BubleSort;
import main.sort.ISorter;
import org.joda.time.LocalDate;

import java.util.Arrays;

public class List {

    private static int counter = -1;
    private int length = 0;
    private Person[] humans = new Person[10];
    private IComparator<Person> comparator = new ComparatorByDate();
    private ISorter<Person> sortMethod = new BubleSort();
    private IChecker<Person> checker = new CheckerByDate();

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
     * Sort your list of Persons.
     */
    public void sort() {
        Person[] temp = new Person[length];
        System.arraycopy(humans, 0, temp, 0, length);
        sortMethod.sort(temp, comparator);
        System.arraycopy(temp, 0, humans, 0, length);
    }

    /**
     * Print info about all persons in list.
     */
    public Person[] getHumans() {
        Person[] persons = new Person[length];
        for (int i = 0; i < length; i++)
            persons[i] = humans[i];
        return persons;
    }

    public List contains(Object value){
        List temp = new List();
        for (int i = 0; i < length; i++){
            if (checker.check(humans[i], value))
                temp.addPerson(humans[i].getLastName(), humans[i].getDate());
        }
        return temp;
    }
}
