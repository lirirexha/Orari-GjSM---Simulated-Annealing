import java.util.ArrayList;

public class Room {
    private String number;
    private ArrayList<Course> courses;
    private ArrayList<Days> days;

    public Room(String number, ArrayList<Course> courses, ArrayList<Days> days) {
        this.number = number;
        this.courses = courses;
        this.days = days;
    }

    public String getNumber() {
        return number;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Days> getDays() {
        return days;
    }
}
