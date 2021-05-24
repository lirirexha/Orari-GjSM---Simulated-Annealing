import java.util.ArrayList;

public class Schedule {
    private ArrayList<Ora> classes;
    private int classNumb = 0;
    private boolean isFitnessChanged = true;
    private double fitness = -1;
    private int numbOfConflicts = 0;
    private Data data;
    public Instructor instructor;
    public Ora ora;

    public Data getData() {
        return data;
    }

    public Schedule(Data data) {
        this.data = data;
        classes = new ArrayList<Ora>(192); // 32*6
    }

    public Schedule initializeRooms() {
        new ArrayList<Room>(data.getRooms()).forEach(room -> {
            new ArrayList<Days>(data.getDays()).forEach(days -> {
                days.getMeetingTimes().forEach(meetingTime -> {
                    Ora newClass = new Ora(classNumb++, meetingTime);
                    newClass.setDay(days);
                    newClass.setRoom(room);
                    Course crs = data.getCourses().get((int) (data.getCourses().size() * Math.random()));
                    Instructor inst = crs.getInstructor();
                    while (!(room.getCourses().contains(crs)) || !(inst.getDays().contains(days))) {
                        crs = data.getCourses().get((int) (data.getCourses().size() * Math.random()));
                        inst = crs.getInstructor();
                    }
                    newClass.setCourse(crs);
                    classes.add(newClass);
                });
            });
        });
        return this;
    }

    public int getNumbOfConflicts() {
        return numbOfConflicts;
    }

    public ArrayList<Ora> getClasses() {
        isFitnessChanged = true;
        return classes;
    }

    public double getFitness() {
        if (isFitnessChanged == true) {
            fitness = calculateFitness();
            isFitnessChanged = false;
        }
        return fitness;
    }

    private double calculateFitness() {
        numbOfConflicts = 0;
        classes.forEach(x -> {
            classes.stream().filter(y -> classes.indexOf(y) >= classes.indexOf(x)).forEach(y -> { // dy prof ne te
                                                                                                  // njejten klase ose
                                                                                                  // dy klase-1prof
                if (x.getMeetingTime() == y.getMeetingTime() && x.getId() != y.getId() && x.getDays() == y.getDays() && x.getCourse() == y.getCourse()) {
                    if (x.getRoom() == y.getRoom())
                        numbOfConflicts++;
                    if (x.getInstructor() == y.getInstructor())
                        numbOfConflicts++;
                }
            });
        });
        // classes.forEach(room -> {
        //     int n = room.getCourse().getInstructor().getNumPerClass();
        //     int n0 = 0;
        //     for (int i = 0; i < 32; i++) {
        //         if(classes.get(i).getCourse() == room.getCourse()) { n0++; } 
        //     }
        //     if(n!=n0){ numbOfConflicts++; }
        // });
        return 1 / (double) (numbOfConflicts + 1);
    }

    public String toString() {
        String returnValue = new String();
        for (int x = 0; x < classes.size() - 1; x++)
            returnValue += classes.get(x) + ",";
        returnValue += classes.get(classes.size() - 1);
        return returnValue;
    }
}
