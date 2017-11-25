package main;
import java.util.Arrays;

public class List {

    private int length = 0;
    private Person[] humans = new Person[10];

    /**
     * @return Count of elements in list.
     */
    public int getLength() {
        return length;
    }

    /**
     * Add person into list.
     * @param person the array to be copies
     */
    public void addPerson(Person person) {
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
}
