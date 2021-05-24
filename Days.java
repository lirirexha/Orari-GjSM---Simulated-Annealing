import java.util.ArrayList;

public class Days {
    private String id;
    private String day;
    private ArrayList<MeetingTime> meetingTimes;

    public Days(String id, String day, ArrayList<MeetingTime> meetingTimes) {
        this.id = id;
        this.day = day;
        this.meetingTimes = meetingTimes;
    }

    public String getId() {
        return id;
    }

    public String getDay() {
        return day;
    }

    public ArrayList<MeetingTime> getMeetingTimes() {
        return meetingTimes;
    }
}
