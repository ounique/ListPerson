package main.essences;
import org.joda.time.LocalDate;

public class Person {

    private LocalDate date;
    private int id;
    private String lastName;

    /**
     * Constructror which include last name and name of a person.
     * Id would be setting automaticaly.
     * @param lastName astName Last name of a persnon.
     * @param date Date of birthday person.
     */
    public Person(String lastName, LocalDate date, int id)
    {
        this.date = date;
        this.lastName = lastName;
        this.id = id;
    }

    /**
     *
     * @return Surname of person.
     */
    public String getLastName() {
        return  lastName;
    }

    /**
     * Give info about user id, last name and birthday.
     * @return Info about user.
     */
    public String getInfo(){
        return "id: " + id + " Name: " + lastName + " Birthday: " + date.toString();
    }

    /**
     *
     * @return Personal user id.
     */
    public int getId() {
        return  id;
    }

    /**
     *
     * @return Date of Birthday user.
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     *
     * @return Age at now.
     */
    public int getCurrentAge() {
        return LocalDate.now().getDayOfYear() > date.getDayOfYear() ? LocalDate.now().getYear() - date.getYear() : LocalDate.now().getYear() - date.getYear() - 1;
    }
}
