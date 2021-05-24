import java.util.ArrayList;

public class MeetingTime {
    private String id;
    private String time;
    private ArrayList<Room> rooms;

    public MeetingTime(String id, String time, ArrayList<Room> rooms) {
        this.id = id;
        this.time = time;
        this.rooms = rooms;
    }

    public String getId() {
        return id;
    }

    public String getTime() {
        return time;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

}
