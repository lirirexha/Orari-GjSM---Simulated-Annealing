//import java.util.ArrayList;

//import java.util.ArrayList;
//Lendet
public class Course {
    private String number = null;
    private String name = null;
    private Instructor instructor;

    public Course(String number, String name, Instructor instructor) {
        this.number = number;
        this.name = name;
        this.instructor = instructor;

    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public String toString() {
        return name;
    }
}
