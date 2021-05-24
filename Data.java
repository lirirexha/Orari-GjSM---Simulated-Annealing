import java.util.ArrayList;
import java.util.Arrays;

public class Data {
    private ArrayList<Room> rooms;
    private ArrayList<Instructor> instructors;
    private ArrayList<Course> courses;
    private ArrayList<MeetingTime> meetingTimes;
    private ArrayList<Days> days;
    private int numberOfCourses = 40;
    private Room X1, X2, XI1, XI2, XII1, XII2;

    public Data() {
        initialize();
    }

    private Data initialize() {

        MeetingTime meetingTime1 = new MeetingTime("MT1", "1: 8:30 - 9:00", rooms);
        MeetingTime meetingTime2 = new MeetingTime("MT2", "2: 9:05 - 9:35", rooms);
        MeetingTime meetingTime3 = new MeetingTime("MT3", "3: 10:00 - 10:30", rooms);
        MeetingTime meetingTime4 = new MeetingTime("MT4", "4: 10:35 - 11:05", rooms);
        MeetingTime meetingTime5 = new MeetingTime("MT5", "5: 11:10 - 11:40", rooms);
        MeetingTime meetingTime6 = new MeetingTime("MT6", "6: 11:45 - 12:15", rooms);
        MeetingTime meetingTime7 = new MeetingTime("MT7", "7: 12:20 - 12:50", rooms);
        meetingTimes = new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4,
                meetingTime5, meetingTime6, meetingTime7));

        Days m = new Days("1", "Monday", meetingTimes);
        Days t = new Days("2", "Tuesday", meetingTimes);
        Days w = new Days("3", "Wednesday", new ArrayList<MeetingTime>(
                Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4, meetingTime5, meetingTime6)));
        Days th = new Days("4", "Thursday", new ArrayList<MeetingTime>(
                Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4, meetingTime5, meetingTime6)));
        Days f = new Days("5", "Friday", new ArrayList<MeetingTime>(
                Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4, meetingTime5, meetingTime6)));
        days = new ArrayList<Days>(Arrays.asList(m, t, w, th, f));

        Instructor instructor1 = new Instructor("I1", "Arta Gjonbalaj", 12, 3, 
                new ArrayList<Room>(Arrays.asList(XI1, XI2, XII1, XII2)),
                new ArrayList<Days>(Arrays.asList(m, t, w, th, f)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4,
                        meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor2 = new Instructor("I2", "Melihate Zeqiri", 6, 3, 
                new ArrayList<Room>(Arrays.asList(X1, X2)), new ArrayList<Days>(Arrays.asList(m, t, w)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime3, meetingTime4, meetingTime5, meetingTime6)));

        Instructor instructor3 = new Instructor("I3", "Rreze Preteni", 8, 2, 
                new ArrayList<Room>(Arrays.asList(XI1, XI2, XII1, XII2)), new ArrayList<Days>(Arrays.asList(t, w, th)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4,
                        meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor4 = new Instructor("I4", "Argjiro Musliu", 4, 2,
                new ArrayList<Room>(Arrays.asList(X1, X2)), new ArrayList<Days>(Arrays.asList(w, th)),
                new ArrayList<MeetingTime>(
                        Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4, meetingTime5)));

        Instructor instructor5 = new Instructor("I5", "Muhib Lohaj", 8, 4,
                new ArrayList<Room>(Arrays.asList(X1, X2)), new ArrayList<Days>(Arrays.asList(t, f)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4,
                        meetingTime5, meetingTime6)));

        Instructor instructor6 = new Instructor("I6", "Menderes Gashi", 8, 4,
                new ArrayList<Room>(Arrays.asList(X1, X2)), new ArrayList<Days>(Arrays.asList(m, th, f)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4,
                        meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor7 = new Instructor("I7", "Shkumbin Makolli", 4, 2,
                new ArrayList<Room>(Arrays.asList(X1, X2)), new ArrayList<Days>(Arrays.asList(t, w)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor8 = new Instructor("I8", "Armend Shabani", 4, 2,
                new ArrayList<Room>(Arrays.asList(X1, X2)), new ArrayList<Days>(Arrays.asList(m)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4,
                        meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor9 = new Instructor("I9", "Bujar Fejzullahu", 8, 4,
                new ArrayList<Room>(Arrays.asList(XI1, XI2)), new ArrayList<Days>(Arrays.asList(m, t)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4,
                        meetingTime5, meetingTime6)));

        Instructor instructor10 = new Instructor("I10", "Nimete Berisha", 6, 3,
                new ArrayList<Room>(Arrays.asList(XI1, XI2)), new ArrayList<Days>(Arrays.asList(w)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4,
                        meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor11 = new Instructor("I11", "Fitore Abdullahu", 6, 3,
                new ArrayList<Room>(Arrays.asList(XI1, XI2)), new ArrayList<Days>(Arrays.asList(m, t, f)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3)));

        Instructor instructor12 = new Instructor("I12", "Fitore Abdullahu", 4, 2,
                new ArrayList<Room>(Arrays.asList(XI1, XI2)), new ArrayList<Days>(Arrays.asList(th, f)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime4, meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor13 = new Instructor("I13", "Naim Braha", 4, 4,
                new ArrayList<Room>(Arrays.asList(XII1)), new ArrayList<Days>(Arrays.asList(w, f)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3)));

        Instructor instructor14 = new Instructor("I14", "Ramadan Limani", 4, 4,
                new ArrayList<Room>(Arrays.asList(XII2)), new ArrayList<Days>(Arrays.asList(m, t)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3)));

        Instructor instructor15 = new Instructor("I15", "Kajtaz Bllaca", 4, 4,
                new ArrayList<Room>(Arrays.asList(XII1)), new ArrayList<Days>(Arrays.asList(t, w)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor16 = new Instructor("I16", "Behar Baxhaku", 4, 4,
                new ArrayList<Room>(Arrays.asList(XII2)), new ArrayList<Days>(Arrays.asList(w, th)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime4, meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor17 = new Instructor("I17", "Shkumbin Makolli", 4, 2,
                new ArrayList<Room>(Arrays.asList(XII1, XII2)), new ArrayList<Days>(Arrays.asList(m, w)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4)));

        Instructor instructor18 = new Instructor("I18", "Elver Bajrami", 4, 2,
                new ArrayList<Room>(Arrays.asList(XII1, XII2)), new ArrayList<Days>(Arrays.asList(t, w)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3)));

        Instructor instructor19 = new Instructor("I19", "Hidajete Dinaj", 12, 2,
                new ArrayList<Room>(Arrays.asList(X1, X2, XI1, XI2, XII1, XII2)),
                new ArrayList<Days>(Arrays.asList(m, t, w, th)), new ArrayList<MeetingTime>(Arrays.asList(meetingTime1,
                        meetingTime2, meetingTime3, meetingTime4, meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor20 = new Instructor("I20", "Leutrim Kika", 6, 1,
                new ArrayList<Room>(Arrays.asList(X1, X2, XI1, XI2, XII1, XII2)),
                new ArrayList<Days>(Arrays.asList(w, f)), new ArrayList<MeetingTime>(Arrays.asList(meetingTime1,
                        meetingTime2, meetingTime3, meetingTime4, meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor21 = new Instructor("I21", "Arbreshe Spahija", 6, 1,
                new ArrayList<Room>(Arrays.asList(X1, X2, XI1, XI2, XII1, XII2)), new ArrayList<Days>(Arrays.asList(w)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4,
                        meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor22 = new Instructor("I22", "Hidajete Dinaj", 2, 1,
                new ArrayList<Room>(Arrays.asList(XI1, XI2)), new ArrayList<Days>(Arrays.asList(f)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime3, meetingTime4, meetingTime5, meetingTime6)));

        Instructor instructor23 = new Instructor("I23", "Shqipe Tredhaku", 2, 1,
                new ArrayList<Room>(Arrays.asList(X1, X2)), new ArrayList<Days>(Arrays.asList(m, t, w, th, f)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4,
                        meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor24 = new Instructor("I24", "Shqipe Tredhaku", 4, 2,
                new ArrayList<Room>(Arrays.asList(X1, X2)), new ArrayList<Days>(Arrays.asList(th, f)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor25 = new Instructor("I25", "Edmond Aliaga", 2, 1,
                new ArrayList<Room>(Arrays.asList(XI1, XI2)), new ArrayList<Days>(Arrays.asList(th)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4)));

        Instructor instructor26 = new Instructor("I26", "Edmond Aliaga", 4, 2,
                new ArrayList<Room>(Arrays.asList(XI1, XI2)), new ArrayList<Days>(Arrays.asList(t)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4,
                        meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor27 = new Instructor("I27", "Artan Alidema", 2, 1,
                new ArrayList<Room>(Arrays.asList(XII1, XII2)), new ArrayList<Days>(Arrays.asList(m, t)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime4, meetingTime5)));

        Instructor instructor28 = new Instructor("I28", "Artan Alidema", 4, 2,
                new ArrayList<Room>(Arrays.asList(XII1, XII2)), new ArrayList<Days>(Arrays.asList(w, th)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime4, meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor29 = new Instructor("I29", "Hanife Ademaj", 2, 1,
                new ArrayList<Room>(Arrays.asList(X1, X2)), new ArrayList<Days>(Arrays.asList(th)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4)));

        Instructor instructor30 = new Instructor("I30", "Ardiana Mani", 2, 1,
                new ArrayList<Room>(Arrays.asList(X1, X2)), new ArrayList<Days>(Arrays.asList(w)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime2, meetingTime3, meetingTime4)));

        Instructor instructor31 = new Instructor("I31", "Nerxhivane Musa", 2, 1,
                new ArrayList<Room>(Arrays.asList(XII1, XII2)), new ArrayList<Days>(Arrays.asList(t)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4)));

        Instructor instructor32 = new Instructor("I32", "Xhevrije Sejdiu", 4, 1,
                new ArrayList<Room>(Arrays.asList(XI1, XI2, XII1, XII2)), new ArrayList<Days>(Arrays.asList(m)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4,
                        meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor33 = new Instructor("I33", "Petrit Rama", 10, 2,
                new ArrayList<Room>(Arrays.asList(X2, XI1, XI2, XII1, XII2)),
                new ArrayList<Days>(Arrays.asList(m, th, f)), new ArrayList<MeetingTime>(Arrays.asList(meetingTime1,
                        meetingTime2, meetingTime3, meetingTime4, meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor34 = new Instructor("I34", "Arjana Govori", 2, 2,
                new ArrayList<Room>(Arrays.asList(X1)), new ArrayList<Days>(Arrays.asList(th)),
                new ArrayList<MeetingTime>(
                        Arrays.asList(meetingTime3, meetingTime4, meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor35 = new Instructor("I35", "Xhevat Krasniqi", 4, 2,
                new ArrayList<Room>(Arrays.asList(X1, X2)), new ArrayList<Days>(Arrays.asList(th)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4,
                        meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor36 = new Instructor("I36", "Armend Shabani", 4, 2,
                new ArrayList<Room>(Arrays.asList(XI1, XI2)), new ArrayList<Days>(Arrays.asList(th)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4,
                        meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor37 = new Instructor("I37", "Ramadan Limani", 4, 2,
                new ArrayList<Room>(Arrays.asList(XII1, XII2)), new ArrayList<Days>(Arrays.asList(f)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime2, meetingTime3, meetingTime4, meetingTime5,
                        meetingTime6, meetingTime7)));

        Instructor instructor38 = new Instructor("I38", "Teuta Gashi", 6, 1,
                new ArrayList<Room>(Arrays.asList(X1, X2, XI1, XI2, XII1, XII2)),
                new ArrayList<Days>(Arrays.asList(w, th)), new ArrayList<MeetingTime>(Arrays.asList(meetingTime1,
                        meetingTime2, meetingTime3, meetingTime4, meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor39 = new Instructor("I39", "Ardiana Mani", 2, 1,
                new ArrayList<Room>(Arrays.asList(X1, X2)), new ArrayList<Days>(Arrays.asList(w)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime5, meetingTime6, meetingTime7)));

        Instructor instructor40 = new Instructor("I40", "Leutrim Kika", 4, 1, 
                new ArrayList<Room>(Arrays.asList(XI1, XI2, XII1, XII2)), new ArrayList<Days>(Arrays.asList(w, f)),
                new ArrayList<MeetingTime>(Arrays.asList(meetingTime3, meetingTime4, meetingTime5)));

        instructors = new ArrayList<Instructor>(Arrays.asList(instructor1, instructor2, instructor3, instructor4,
                instructor5, instructor6, instructor7, instructor8, instructor9, instructor10, instructor11,
                instructor12, instructor13, instructor14, instructor15, instructor16, instructor17, instructor18,
                instructor19, instructor20, instructor21, instructor22, instructor23, instructor24, instructor25,
                instructor26, instructor27, instructor28, instructor29, instructor30, instructor31, instructor32,
                instructor33, instructor34, instructor35, instructor36, instructor37, instructor38, instructor39,
                instructor40));

        Course course1 = new Course("C1", "Gjuhë amtare - X, XII", instructor1);
        Course course2 = new Course("C2", "Gjuhë amtare - X", instructor2);
        Course course3 = new Course("C3", "Gjuhë angleze - XI, XII", instructor3);
        Course course4 = new Course("C4", "Gjuhë angleze - X", instructor4);
        Course course5 = new Course("C5", "Algjebër 1", instructor5);
        Course course6 = new Course("C6", "Gjeometri 1", instructor6);
        Course course7 = new Course("C7", "Teoria e numrave", instructor7);
        Course course8 = new Course("C8", "Kombinatorikë", instructor8);
        Course course9 = new Course("C9", "Analizë me algjebër", instructor9);
        Course course10 = new Course("C10", "Trigonometri", instructor10);
        Course course11 = new Course("C11", "Gjeometri 2", instructor11);
        Course course12 = new Course("C12", "Teori e probabilitetit", instructor12);
        Course course13 = new Course("C13", "Analize matematike XII/1", instructor13);
        Course course14 = new Course("C14", "Analize matematike XII/2", instructor14);
        Course course15 = new Course("C15", "Algjeber 2 - XII/1", instructor15);
        Course course16 = new Course("C16", "Algjeber 2 - XII/2", instructor16);
        Course course17 = new Course("C17", "Statistike", instructor17);
        Course course18 = new Course("C18", "Matematike Financiare", instructor18);
        Course course19 = new Course("C19", "Fizike", instructor19);
        Course course20 = new Course("C20", "Kimi", instructor20);
        Course course21 = new Course("C21", "Biologji", instructor21);
        Course course22 = new Course("C22", "Astronomi", instructor22);
        Course course23 = new Course("C23", "TIK", instructor23);
        Course course24 = new Course("C24", "Algoritmet C++", instructor24);
        Course course25 = new Course("C25", "Org. dhe ark. e PC", instructor25);
        Course course26 = new Course("C26", "Bazat e te dhenave SQL", instructor26);
        Course course27 = new Course("C27", "Programimi i avancuar", instructor27);
        Course course28 = new Course("C28", "Grafika kompk. prog. Java", instructor28);
        Course course29 = new Course("C29", "Histori", instructor29);
        Course course30 = new Course("C30", "Gjeografi", instructor30);
        Course course31 = new Course("C31", "Filozofi", instructor31);
        Course course32 = new Course("C32", "Sociologji", instructor32);
        Course course33 = new Course("C33", "Edukim fizik - X/2, XI, XII", instructor33);
        Course course34 = new Course("C34", "Edukim fizik - X/1", instructor34);
        Course course35 = new Course("C35", "Inekuacionet", instructor35);
        Course course36 = new Course("C36", "Aplikacione kompjuerike", instructor36);
        Course course37 = new Course("C37", "Programimi linear", instructor37);
        Course course38 = new Course("C38", "Gjuhe gjermane", instructor38);
        Course course39 = new Course("C39", "BE dhe Integrime", instructor39);
        Course course40 = new Course("C40", "Eksperimente ne Kimi", instructor40);

        courses = new ArrayList<Course>(Arrays.asList(course1, course2, course3, course4, course5, course6, course7,
                course8, course9, course10, course11, course12, course13, course14, course15, course16, course17,
                course18, course19, course20, course21, course22, course23, course24, course25, course26, course27,
                course28, course29, course30, course31, course32, course33, course34, course35, course36, course37,
                course38, course39, course40));
        numberOfCourses = getCourses().size();

        X1 = new Room("X1",
                new ArrayList<Course>(Arrays.asList(course2, course4, course5, course6, course7, course8, course19,
                        course20, course21, course23, course24, course29, course30, course34, course35, course38,
                        course39)),
                days);
        X2 = new Room("X2",
                new ArrayList<Course>(Arrays.asList(course2, course4, course5, course6, course7, course8, course19,
                        course20, course21, course23, course24, course29, course30, course33, course35, course38,
                        course39)),
                days);
        XI1 = new Room("XI1",
                new ArrayList<Course>(Arrays.asList(course1, course3, course9, course10, course11, course12, course19,
                        course20, course21, course22, course25, course26, course32, course33, course36, course38,
                        course40)),
                days);
        XI2 = new Room("XI2",
                new ArrayList<Course>(Arrays.asList(course1, course3, course9, course10, course11, course12, course19,
                        course20, course21, course22, course25, course26, course32, course33, course36, course38,
                        course40)),
                days);
        XII1 = new Room("XII1",
                new ArrayList<Course>(Arrays.asList(course1, course3, course13, course15, course17, course18, course19,
                        course20, course21, course27, course28, course31, course32, course33, course37, course38,
                        course40)),
                days);
        XII2 = new Room("XII2",
                new ArrayList<Course>(Arrays.asList(course1, course3, course14, course16, course17, course18, course19,
                        course20, course21, course27, course28, course31, course32, course33, course37, course38,
                        course40)),
                days);
        rooms = new ArrayList<Room>(Arrays.asList(X1, X2, XI1, XI2, XII1, XII2));

        return this;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<MeetingTime> getMeetingTimes() {
        return meetingTimes;
    }

    public int getNumberOfCourses() {
        return this.numberOfCourses;
    }

    public ArrayList<Days> getDays() {
        return days;
    }

}
