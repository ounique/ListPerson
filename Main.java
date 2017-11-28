package main;
import org.joda.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        list.addPerson(new Person("Eugene Karpova", new LocalDate(1998, 5, 18)));
        list.addPerson(new Person("Eugene Karpov", new LocalDate(1998, 5, 18)));
        list.addPerson(new Person("Artem Azarov", new LocalDate(1998, 10, 7)));
        list.print();
        System.out.println();
        list.sort(new ComparatorByLastName(), new BubleSort());
        list.print();
    }
}
