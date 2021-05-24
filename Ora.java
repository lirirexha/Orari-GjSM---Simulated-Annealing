public class Ora {
    private int id;
    private Course course;
    private Instructor instructor;
    private MeetingTime meetingTime;
    private Room room;
    private Days day;

    public Ora(int id, MeetingTime meetingTime) {
        this.id = id;
        this.meetingTime = meetingTime;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setDay(Days day) {
        this.day = day;
    }

    public void setMeetingTime(MeetingTime meetingTime) {
        this.meetingTime = meetingTime;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public Course getCourse() {
        return course;
    }

    public Days getDays() {
        return day;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public MeetingTime getMeetingTime() {
        return meetingTime;
    }

    public Room getRoom() {
        return room;
    }

    public String toString() {
        return "[" + day.getDay() + ", " + room.getNumber() + ", " + course.getNumber() + ", " + meetingTime.getId()
                + " ]";
    }
}
