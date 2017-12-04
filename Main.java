package main;
import main.comparators.ComparatorByLastName;
import main.sort.BubleSort;
import org.joda.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        list.addPerson("Eugene Karpova", new LocalDate(1998, 5, 18));
        list.addPerson("Eugene Karpov", new LocalDate(1998, 5, 18));
        list.addPerson("Artem Azarov", new LocalDate(1998, 10, 7));
        Person[] temp = list.print();
        for (int i = 0; i < temp.length; i++)
            System.out.println(temp[i].getInfo());
        System.out.println();
        list.sort(new ComparatorByLastName(), new BubleSort());
        temp = list.print();
        for (int i = 0; i < temp.length; i++)
            System.out.println(temp[i].getInfo());
        System.out.println();
    }
}
