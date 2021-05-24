import java.util.ArrayList;
import java.util.stream.IntStream;

public class Solutions {
    private ArrayList<Schedule> schedules;

    public Solutions(int size, Data data) {
        schedules = new ArrayList<Schedule>(size);
        IntStream.range(0, size).forEach(x -> schedules.add(new Schedule(data).initializeRooms()));
    }

    public ArrayList<Schedule> getSchedules() {
        return this.schedules;
    }

    public Solutions sortByFitness() {
        schedules.sort((schedule1, schedule2) -> {
            int returnValue = 0;
            if (schedule1.getFitness() > schedule2.getFitness())
                returnValue = -1;
            else if (schedule1.getFitness() < schedule2.getFitness())
                returnValue = 1;
            return returnValue;
        });
        return this;
    }
}
