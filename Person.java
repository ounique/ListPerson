package main;

import org.joda.time.LocalDate;

public class Person {

    private static int counter = -1;
    private LocalDate date;
    private int id;
    private String LastName;

    /**
     * Constructror which include last name and name of a person.
     * Id would be setting automaticaly.
     * @param LastName Last name of a persnon.
     * @param date Date of birthday person.
     */
    public Person(String LastName, LocalDate date)
    {
        this.date = date;
        this.LastName = LastName;
        this.id = ++counter;
    }

    /**
     *
     * @return Surname of person.
     */
    public String getLastName() {
        return  LastName;
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
    public int GetCurrentAge() {
        return LocalDate.now().getDayOfYear() > date.getDayOfYear() ? LocalDate.now().getYear() - date.getYear() : LocalDate.now().getYear() - date.getYear() - 1;
    }
}
