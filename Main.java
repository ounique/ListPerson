package main;
import org.joda.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        list.addPerson(new Person("Eugene Karpov", new LocalDate(1998, 5, 18)));
        Person test = new Person("Eugene Karpov", new LocalDate(1998, 5, 18));
        System.out.println(test.getInfo());
        list.addPerson(new Person("Eugene Karpov", new LocalDate(1998, 5, 18)));
        System.out.println(list.search(0));
        list.sort(new ComparatorById(), new BubleSort());
    }
}
