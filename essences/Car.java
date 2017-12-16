package main.essences;

public class Car {

    private String number;
    private String sound;
    private int countWheels;

    /**
     *
     * @param number Number of car
     * @param sound Sound when car is ringing
     * @param countWheels Count of wheels of car
     */
    public Car(String number, String sound, int countWheels) {
        this.number = number;
        this.sound = sound;
        this.countWheels = countWheels;
    }

    /**
     *
     * @return All info about user.
     */
    public String getInfo(){
        return "Номер: " + number + " Звук: " + sound + " Кол-во колес: " + countWheels;
    }

    public String getNumber() {
        return number;
    }

    public String getSound() {
        return sound;
    }

    public int getCountWheels() {
        return countWheels;
    }

}
