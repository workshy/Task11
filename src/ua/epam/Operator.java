package ua.epam;

/**
 * Created by Viktoriia_Marynchak on 9/26/2016.
 */
public class Operator
{
    private String firstName;
    private String lastName;
    // Оператор управляет конкретным роботом
    private Robot robot;

    public Operator(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // У оператора можно спросить каким роботом он управляет
    public Robot getRobot() {
        return robot;
    }

    // Оператору можно поручить управлять роботом
    public void setRobot(Robot robot) {
        this.robot = robot;
    }
}
